package com.example.pocollect;

import java.util.ArrayList;

public class Database {
    private ArrayList<PokemonItem> pokemonList = new ArrayList<>();

    public Database(){
        pokemonList.add(new PokemonItem(1,"esanghaessi","이상해씨"));
        pokemonList.add(new PokemonItem(2,"esanghaeful","이상해풀"));
        pokemonList.add(new PokemonItem(3,"esanghaeflower","이상해꽃"));
        pokemonList.add(new PokemonItem(4,"firey","파이리"));
        pokemonList.add(new PokemonItem(5,"rizard","리자드"));
        pokemonList.add(new PokemonItem(10,"rizarmong","리자몽"));
        pokemonList.add(new PokemonItem(7,"kkobuki","꼬부기"));
        pokemonList.add(new PokemonItem(8,"unibuki","어니부기"));
        pokemonList.add(new PokemonItem(9,"gubookking","거북왕"));
        pokemonList.add(new PokemonItem(10,"caterpie","캐터피"));
        pokemonList.add(new PokemonItem(11,"dandeki","단데기"));
        pokemonList.add(new PokemonItem(12,"butterfle","버터플"));
        pokemonList.add(new PokemonItem(13,"bbulchung","뿔충이"));
        pokemonList.add(new PokemonItem(14,"ddakchung","딱충이"));
        pokemonList.add(new PokemonItem(15,"dokchimbung","독침붕"));
        pokemonList.add(new PokemonItem(16,"gugu","구구"));
        pokemonList.add(new PokemonItem(17,"pigeon","피죤"));
        pokemonList.add(new PokemonItem(18,"pigeonto","피죤투"));
        pokemonList.add(new PokemonItem(19,"kkoret","꼬렛"));
        pokemonList.add(new PokemonItem(20,"retra","레트라"));

        pokemonList.add(new PokemonItem(21,"kkebicham","깨비참"));
        pokemonList.add(new PokemonItem(22,"kkebidrill","깨비드릴조"));
        pokemonList.add(new PokemonItem(23,"abo","아보"));
        pokemonList.add(new PokemonItem(24,"abok","아보크"));
        pokemonList.add(new PokemonItem(25,"pikachu","피카츄"));
        pokemonList.add(new PokemonItem(26,"raichu","라이츄"));
        pokemonList.add(new PokemonItem(27,"moraedugi","모래두지"));
        pokemonList.add(new PokemonItem(28,"gozi","고지"));
        pokemonList.add(new PokemonItem(29,"nidrunf","니드런(암)"));
        pokemonList.add(new PokemonItem(30,"nidrina","니드리나"));
        pokemonList.add(new PokemonItem(31,"nidqueen","니드퀸"));
        pokemonList.add(new PokemonItem(32,"nidrunm","니드런(수)"));
        pokemonList.add(new PokemonItem(33,"nidrino","니드리노"));
        pokemonList.add(new PokemonItem(34,"nidking","니드킹"));
        pokemonList.add(new PokemonItem(35,"bbibbi","삐삐"));
        pokemonList.add(new PokemonItem(36,"pixie","픽시"));
        pokemonList.add(new PokemonItem(37,"sixtail","식스테일"));
        pokemonList.add(new PokemonItem(38,"ninetail","나인테일"));
        pokemonList.add(new PokemonItem(39,"purin","푸린"));
        pokemonList.add(new PokemonItem(40,"pukrin","푸크린"));

        pokemonList.add(new PokemonItem(41,"jubat","주뱃"));
        pokemonList.add(new PokemonItem(42,"golbat","골뱃"));
        pokemonList.add(new PokemonItem(43,"ddubukcho","뚜벅초"));
        pokemonList.add(new PokemonItem(44,"namsaeggo","냄새꼬"));
        pokemonList.add(new PokemonItem(45,"rafresia","라플레시아"));
        pokemonList.add(new PokemonItem(46,"paras","파라스"));
        pokemonList.add(new PokemonItem(47,"parasect","파라섹트"));
        pokemonList.add(new PokemonItem(48,"conpang","콘팡"));
        pokemonList.add(new PokemonItem(49,"donari","도나리"));
        pokemonList.add(new PokemonItem(50,"digda","디그다"));
        pokemonList.add(new PokemonItem(51,"dagtrio","닥트리오"));
        pokemonList.add(new PokemonItem(52,"naong","나옹"));
        pokemonList.add(new PokemonItem(53,"persion","페르시온"));
        pokemonList.add(new PokemonItem(54,"golapaduck","고라파덕"));
        pokemonList.add(new PokemonItem(55,"golduck","골덕"));
        pokemonList.add(new PokemonItem(56,"mankey","망키"));
        pokemonList.add(new PokemonItem(57,"sungmonkey","성원숭"));
        pokemonList.add(new PokemonItem(58,"gadi","가디"));
        pokemonList.add(new PokemonItem(59,"windy","윈디"));
        pokemonList.add(new PokemonItem(60,"balcaeng","발챙이"));

        pokemonList.add(new PokemonItem(61,"shulukcaeng","수륙챙이"));
        pokemonList.add(new PokemonItem(62,"kangcaeng","강챙이"));
        pokemonList.add(new PokemonItem(63,"kaisy","케이시"));
        pokemonList.add(new PokemonItem(64,"yoongela","윤겔라"));
        pokemonList.add(new PokemonItem(65,"hoodin","후딘"));
        pokemonList.add(new PokemonItem(66,"altong","알통몬"));
        pokemonList.add(new PokemonItem(67,"muscle","근육몬"));
        pokemonList.add(new PokemonItem(68,"geoiruk","괴력몬"));
        pokemonList.add(new PokemonItem(69,"modapy","모다피"));
        pokemonList.add(new PokemonItem(70,"uthudong","우츠동"));
        pokemonList.add(new PokemonItem(71,"uthboat","우츠보트"));
        pokemonList.add(new PokemonItem(72,"kingeyehae","왕눈해"));
        pokemonList.add(new PokemonItem(73,"dokpari","독파리"));
        pokemonList.add(new PokemonItem(74,"kkomadol","꼬마돌"));
        pokemonList.add(new PokemonItem(75,"deguri","데구리"));
        pokemonList.add(new PokemonItem(76,"ddakguri","딱구리"));
        pokemonList.add(new PokemonItem(77,"ponita","포니타"));
        pokemonList.add(new PokemonItem(78,"nalssangma","날쌩마"));
        pokemonList.add(new PokemonItem(79,"yadon","야돈"));
        pokemonList.add(new PokemonItem(80,"yadoran","야도란"));

        pokemonList.add(new PokemonItem(81,"coil","코일"));
        pokemonList.add(new PokemonItem(82,"rarecoil","레어코일"));
        pokemonList.add(new PokemonItem(83,"paori","파오리"));
        pokemonList.add(new PokemonItem(84,"dudu","두두"));
        pokemonList.add(new PokemonItem(85,"dutrio","두트리오"));
        pokemonList.add(new PokemonItem(86,"juju","쥬쥬"));
        pokemonList.add(new PokemonItem(87,"jragon","쥬레곤"));
        pokemonList.add(new PokemonItem(88,"jilpuk","질퍽이"));
        pokemonList.add(new PokemonItem(89,"jilppuk","질뻐기"));
        pokemonList.add(new PokemonItem(90,"celler","셀러"));
        pokemonList.add(new PokemonItem(91,"parcell","파르셀"));
        pokemonList.add(new PokemonItem(92,"goas","고오스"));
        pokemonList.add(new PokemonItem(93,"goust","고우스트"));
        pokemonList.add(new PokemonItem(94,"phantom","팬텀"));
        pokemonList.add(new PokemonItem(95,"longstone","롱스톤"));
        pokemonList.add(new PokemonItem(96,"sliff","슬리프"));
        pokemonList.add(new PokemonItem(97,"sliffer","슬리퍼"));
        pokemonList.add(new PokemonItem(98,"crap","크랩"));
        pokemonList.add(new PokemonItem(99,"kingcrap","킹크랩"));
        pokemonList.add(new PokemonItem(100,"ziririball","찌리리공"));

        pokemonList.add(new PokemonItem(101,"boomball","붐볼"));
        pokemonList.add(new PokemonItem(102,"arari","아라리"));
        pokemonList.add(new PokemonItem(103,"nasi","나시"));
        pokemonList.add(new PokemonItem(104,"tanguri","탕구리"));
        pokemonList.add(new PokemonItem(105,"tunguri","텅구리"));
        pokemonList.add(new PokemonItem(106,"sirasomon","시라소몬"));
        pokemonList.add(new PokemonItem(107,"hongsumon","홍수몬"));
        pokemonList.add(new PokemonItem(108,"naerumi","내루미"));
        pokemonList.add(new PokemonItem(109,"ddogas","또가스"));
        pokemonList.add(new PokemonItem(110,"ddodogas","또도가스"));
        pokemonList.add(new PokemonItem(111,"bbulcano","뿔카노"));
        pokemonList.add(new PokemonItem(112,"kobburi","코뿌리"));
        pokemonList.add(new PokemonItem(113,"lucky","럭키"));
        pokemonList.add(new PokemonItem(114,"dungkuri","덩쿠리"));
        pokemonList.add(new PokemonItem(115,"kangka","캥카"));
        pokemonList.add(new PokemonItem(116,"ssodra","쏘드라"));
        pokemonList.add(new PokemonItem(117,"sidra","시드라"));
        pokemonList.add(new PokemonItem(118,"konchi","콘치"));
        pokemonList.add(new PokemonItem(119,"wangkonchi","왕콘치"));
        pokemonList.add(new PokemonItem(120,"bulgasari","별가사리"));

        pokemonList.add(new PokemonItem(121,"aqustar","아쿠스타"));
        pokemonList.add(new PokemonItem(122,"maimman","마임맨"));
        pokemonList.add(new PokemonItem(123,"srak","스라크"));
        pokemonList.add(new PokemonItem(124,"lujura","루주라"));
        pokemonList.add(new PokemonItem(125,"erev","에레브"));
        pokemonList.add(new PokemonItem(126,"magma","마그마"));
        pokemonList.add(new PokemonItem(127,"bbusaiser","쁘사이저"));
        pokemonList.add(new PokemonItem(128,"kentaros","켄타로스"));
        pokemonList.add(new PokemonItem(129,"ingerking","잉어킹"));
        pokemonList.add(new PokemonItem(130,"gyarados","갸라도스"));
        pokemonList.add(new PokemonItem(131,"rafras","라프라스"));
        pokemonList.add(new PokemonItem(132,"metamong","메타몽"));
        pokemonList.add(new PokemonItem(133,"evee","이브이"));
        pokemonList.add(new PokemonItem(134,"shamid","샤미드"));
        pokemonList.add(new PokemonItem(135,"jupithunder","쥬피썬더"));
        pokemonList.add(new PokemonItem(136,"booster","부스터"));
        pokemonList.add(new PokemonItem(137,"polygon","폴리곤"));
        pokemonList.add(new PokemonItem(138,"amnite","암나이트"));
        pokemonList.add(new PokemonItem(139,"amstar","암스타"));
        pokemonList.add(new PokemonItem(140,"tugu","투구"));

        pokemonList.add(new PokemonItem(141,"tugupus","투구푸스"));
        pokemonList.add(new PokemonItem(142,"ftera","프테라"));
        pokemonList.add(new PokemonItem(143,"zammanbo","잠만보"));
        pokemonList.add(new PokemonItem(144,"freezer","프리져"));
        pokemonList.add(new PokemonItem(145,"thunder","썬더"));
        pokemonList.add(new PokemonItem(146,"fire","파이어"));
        pokemonList.add(new PokemonItem(147,"menyong","미뇽"));
        pokemonList.add(new PokemonItem(148,"sinyong","신뇽"));
        pokemonList.add(new PokemonItem(149,"mangnanyong","망나뇽"));
        pokemonList.add(new PokemonItem(150,"mewtwo","뮤츠"));
        pokemonList.add(new PokemonItem(151,"mew","뮤"));









        /*
        pokemonList.add(new PokemonItem(1,"pigeonto","피죤투", false));
        pokemonList.add(new PokemonItem(1,"pigeonto","피죤투", false));
        pokemonList.add(new PokemonItem(1,"pigeonto","피죤투", false));
        pokemonList.add(new PokemonItem(1,"pigeonto","피죤투", false));
        pokemonList.add(new PokemonItem(1,"pigeonto","피죤투", false));
        pokemonList.add(new PokemonItem(1,"pigeonto","피죤투", false));
        pokemonList.add(new PokemonItem(1,"pigeonto","피죤투", false));
        pokemonList.add(new PokemonItem(1,"pigeonto","피죤투", false));
        pokemonList.add(new PokemonItem(1,"pigeonto","피죤투", false));
        pokemonList.add(new PokemonItem(1,"pigeonto","피죤투", false));
        pokemonList.add(new PokemonItem(1,"pigeonto","피죤투", false));
        pokemonList.add(new PokemonItem(1,"pigeonto","피죤투", false));
        pokemonList.add(new PokemonItem(1,"pigeonto","피죤투", false));
        pokemonList.add(new PokemonItem(1,"pigeonto","피죤투", false));
        pokemonList.add(new PokemonItem(1,"pigeonto","피죤투", false));
        pokemonList.add(new PokemonItem(1,"pigeonto","피죤투", false));
        pokemonList.add(new PokemonItem(1,"pigeonto","피죤투", false));
        pokemonList.add(new PokemonItem(1,"pigeonto","피죤투", false));
        pokemonList.add(new PokemonItem(1,"pigeonto","피죤투", false));
        pokemonList.add(new PokemonItem(1,"pigeonto","피죤투", false));
        pokemonList.add(new PokemonItem(1,"pigeonto","피죤투", false));
        pokemonList.add(new PokemonItem(1,"pigeonto","피죤투", false));
        pokemonList.add(new PokemonItem(1,"pigeonto","피죤투", false));
        pokemonList.add(new PokemonItem(1,"pigeonto","피죤투", false));
        pokemonList.add(new PokemonItem(1,"pigeonto","피죤투", false));
        pokemonList.add(new PokemonItem(1,"pigeonto","피죤투", false));
        pokemonList.add(new PokemonItem(1,"pigeonto","피죤투", false));
        pokemonList.add(new PokemonItem(1,"pigeonto","피죤투", false));
        */

    }

    public ArrayList<PokemonItem> getPokemonList() {
        return pokemonList;
    }
}
