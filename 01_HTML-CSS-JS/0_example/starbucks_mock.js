const heroTitle = document.getElementById('hero-title');
const heroDesc = document.getElementById('hero-desc');
const heroCta = document.getElementById('hero-cta');
const menuItems = document.querySelectorAll('.menu-item');
const promoButtons = document.querySelectorAll('[data-promo]');

const heroCopy = {
  coffee: {
    title: 'Bloom Into Spring Vibes',
    desc: '봄 시즌 한정 라인업을 만나보세요. 부드러운 라떼와 싱그러운 블렌드로 하루를 시작하세요.',
    cta: '#menu',
  },
  menu: {
    title: "Today's Picks, Crafted",
    desc: '바쁜 하루에 딱 맞는 추천 음료를 확인하세요. 클릭하면 소개 문구가 바뀝니다.',
    cta: '#menu',
  },
  store: {
    title: 'Find Your Store',
    desc: '가까운 매장을 빠르게 찾고, 리저브 매장의 특별함을 경험하세요.',
    cta: '#store',
  },
  rewards: {
    title: 'Rewards That Stack',
    desc: '별이 쌓일수록 혜택도 커집니다. 모바일 카드로 더 편하게.',
    cta: '#rewards',
  },
  whatsnew: {
    title: "What's New This Week",
    desc: '새로운 캠페인과 시즌 소식을 확인하세요.',
    cta: '#whatsnew',
  },
  cream: {
    title: 'Sweet Cream Latte',
    desc: '달콤하고 부드러운 슈크림 라떼로 봄을 시작하세요.',
    cta: '#menu',
  },
  foam: {
    title: 'Soft Foam Latte',
    desc: '가벼운 거품과 고소한 바디감의 균형을 즐겨보세요.',
    cta: '#menu',
  },
  cherry: {
    title: 'Cherry Blossom Special',
    desc: '꽃향이 은은하게 퍼지는 시즌 한정 음료입니다.',
    cta: '#menu',
  },
  blend: {
    title: 'Spring Blend Beans',
    desc: '한정 원두로 완성한 산뜻한 향미를 느껴보세요.',
    cta: '#menu',
  },
};

function setHero(key) {
  const data = heroCopy[key];
  if (!data) return;
  heroTitle.textContent = data.title;
  heroDesc.textContent = data.desc;
  heroCta.setAttribute('href', data.cta);
}

menuItems.forEach((item) => {
  item.addEventListener('click', (e) => {
    e.preventDefault();
    menuItems.forEach((i) => i.classList.remove('is-active'));
    item.classList.add('is-active');
    setHero(item.dataset.section);

    const target = document.querySelector(item.getAttribute('href'));
    if (target) {
      target.scrollIntoView({ behavior: 'smooth' });
    }
  });
});

promoButtons.forEach((btn) => {
  btn.addEventListener('click', () => {
    setHero(btn.dataset.promo);
  });
});
