package main.java.ch12_stream.bonus;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieAnalysis {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("인셉션", "SF", 2010, 8.8),
                new Movie("어벤져스", "액션", 2012, 8.0),
                new Movie("기생충", "드라마", 2019, 8.6),
                new Movie("매트릭스", "SF", 1999, 8.7),
                new Movie("인터스텔라", "SF", 2014, 8.6),
                new Movie("다크나이트", "액션", 2008, 9.0),
                new Movie("어바웃타임", "로맨스", 2013, 8.3),
                new Movie("라라랜드", "뮤지컬", 2016, 8.1)
        );

        // 1. 장르가 "SF"인 영화의 평균 평점 구하기
        // 결과 : 약 8.7
        double avgsf = movies.stream()
                // List(movies)를 스트림으로 만들고 결과를 avgsf에 담음
                .filter(m->m.getGenre().equals("SF"))
                // 장르가 sf인 영화만 도출
                .mapToDouble(Movie::getRating)
                // 부합하는 객체들을 double로 변경
                .average()
                // DoubleStream에 들어있는 평점 평균 계산
                .orElse(0.0);
                // 평균값이 있으면 값을꺼내고, 없으면 0.0으로 사용
        System.out.printf("SF영화의 평점 : 약 %.1f\n",avgsf);

        // 2. 2010년 이후 개봉된 영화를 평점 내림차순으로 정렬하여 제목 리스트를 반환하기
        // 결과 : [인셉션, 기생충, 인터스텔라, 어바웃타임, 라라랜드, 어벤져스]
        List<String> titles = movies.stream()
                // movies를 스트림으로 변경 -> 결과를 titles에 담음
                .filter(m->m.getReleaseYear()>=2010)
                // 영화 개봉년도 조건
                .sorted(Comparator.comparingDouble(Movie::getRating).reversed())
                // 정렬 reversed()때문에 내림차순으로 정렬
                .map(Movie::getTitle)
                // 정렬된 객체들중 title만 뽑음
                .toList();
                // 제목 스트림을 List로 수집
        System.out.println(titles);

        // 3. 가장 최근에 개봉된 영화 3개의 제목을 반환하기
        //  결과 : [기생충, 라라랜드, 인터스텔라]
        List<String> recentTitles = movies.stream()
                .sorted(Comparator.comparingInt(Movie::getReleaseYear).reversed())
                .limit(3)
                .map(Movie::getTitle)
                .toList();
        System.out.println(recentTitles);

        // 4. 각 장르별로 영화를 그룹화하고, 장르별 영화 수를 맵으로 반환하기
        // 결과 : {SF=3, 액션=2, 드라마=1, 로맨스=1, 뮤지컬=1}
        Map<String,Long> generes = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre,Collectors.counting()));
        System.out.println(generes);

        // 5. 평점이 8.5 이상인 영화들의 장르를 중복 없이 알파벳 순으로 정렬하여 반환하기
        // 결과 : [SF, 드라마, 액션]
        
    }
}