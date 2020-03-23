package com.example.lojongproject.abas;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lojongproject.PlayerActivity;
import com.example.lojongproject.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Citacoes extends Fragment {


    private List<ArtigosClass> listaArtigos = new ArrayList<>();

    public Citacoes() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.fragment_citacoes, container, false);

        RecyclerView recyclerView = (RecyclerView) root.findViewById(R.id.listaview);

        CriarArtigos();

        //AdapterCitacoes adapter = new AdapterCitacoes(listaArtigos);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        recyclerView.setAdapter(new AdapterCitacoes(listaArtigos, new AdapterCitacoes.OnItemClickListener() {
            @Override
            public void onItemClick(ArtigosClass artigo) {
                Intent sendIntent = new Intent(Intent.ACTION_SEND);
                sendIntent.setType("text/plain");
                sendIntent.putExtra(Intent.EXTRA_SUBJECT, "Citação");
                sendIntent.putExtra(Intent.EXTRA_TEXT, artigo.getDescricao());
                startActivity(Intent.createChooser(sendIntent,"Compartilhar via"));

            }
        }));




       // recyclerView.setAdapter(adapter);
        // Inflate the layout for this fragment
        return root;
    }

    public  void CriarArtigos(){

        ArtigosClass artigo =  new ArtigosClass("Phakchok Rinpoche","Por que você precisa meditar? Porque se você não praticar, eu te garanto que sua mente vai brincar com você, feliz e depois triste, animada e desanimada, mal humorada e depressiva, e depois excitada e sem controle, apenas seguindo o que sente. A meditação o ajuda a encontrar equilíbrio em sua vida. Por favor, entenda que equilíbrio vem de dentro, do relacionamento com sua própria mente, não tem nada a ver com o que acontece do lado de fora.",
                R.drawable.artboardblue);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Mingyur Rinpoche","A única diferença entre a meditação e o aprofundamento de uma amizade é que, no primeiro caso, o amigo que aprendem a conhecer pouco a pouco são vocês mesmos.",
                R.drawable.artboardpink);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Matthieu Ricard","Meditar é cultivar um estado mental. É um treino. Ninguém espera tocar piano sem treino. Por que esperar que compaixão, altruísmo, liberdade interior e concentração ocorram magicamente?",
                R.drawable.artboardorange);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Victor Frankl","“Entre um estímulo e uma resposta, há um espaço. Nesse espaço está a nossa liberdade e o nosso poder para escolhermos a nossa resposta. Nessa resposta está o potencial do nosso crescimento e o do nosso bem-estar.”",
                R.drawable.artboardblue);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Pema Chodron","A razão pela qual não abrimos nossos corações para os outros é que eles provocam confusão em nós. Na medida em que olhamos com clareza e compaixão para nós mesmos, nos sentimos confiantes ao olhar nos olhos de outra pessoa.",
                R.drawable.artboardpink);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Dzigar Kongtrul Rinpoche","Olhe a sua mente todo dia e tente reconhecer quaisquer rancores que você ainda esteja mantendo. Isso se aplica à qualquer coisa que te dê até mesmo o mais sutil sentimento de desconforto. A partir daí pratique desenvolver a tolerância e paciência focando esses sentimentos. Lembre-se que a principal coisa em risco aqui é a sua paz, o seu estado de espírito alegre.",
                R.drawable.artboardorange);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Dalai Lama","Sempre teremos problemas para enfrentar, mas se nossa mente estiver calma, isso vai fazer toda a diferença. Na superfície podemos ficar chateados, mas tudo muda se pudermos permanecer calmos nas profundezas da nossa mente.",
                R.drawable.artboardblue);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Dilgo Khyentse Rinpoche","Quando você corre atrás dos pensamentos, você se comporta como um cão correndo atrás de um bastão - cada vez que é lançado, você corre atrás dele. Mas se em vez disso, você voltar sua atenção para a origem desses pensamentos, de onde eles vêm, você verá que cada um deles surge e se dissolve no espaço da consciência, sem dar origem a outros pensamentos. Seja como um leão, que em vez de correr atrás do bastão, se volta para quem o atirou. Para o leão, atira-se o bastão uma vez só.",
                R.drawable.artboardpink);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Pema Chodron no livro \\\"Quando tudo se desfaz”","Em vez de lutar contra a força da confusão, podemos nos encontrar com ela e relaxar. Quando fazemos isso, gradualmente descobrimos que a claridade está sempre lá. No meio do pior cenário da pior pessoa do mundo, no  meio de todo o pesado diálogo com nós mesmos, o espaço aberto está sempre lá.",
                R.drawable.artboardorange);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Dzogchen Ponlop Rinpoche","Quando a mente fica mais calma pela meditação, vivenciamos cada vez mais o que está acontecendo, momento a momento. Começamos a ver que a vida é bem mais interessante do que os nossos pensamentos sobre ela.",
                R.drawable.artboardblue);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Jetsunma Tenzin Palmo","Há o pensamento, e então a consciência sobre o pensamento. A diferença entre estar consciente do pensamento e apenas pensar é imensa. É enorme. Normalmente ficamos tão identificados com nossos pensamentos e emoções, que somos eles. Somos a felicidade, somos a raiva, somos o medo. Precisamos aprender a dar um passo para trás e saber que nossos pensamentos e emoções são apenas pensamentos e emoções. Eles são apenas estados mentais. Não são sólidos, são transparentes.",
                R.drawable.artboardpink);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Alan Wallace","A razão para não dedicarmos mais tempo a equilibrar as nossas mentes é que estamos apostando nossas vidas na premissa de que encontraremos a felicidade que buscamos perseguindo prazeres transitórios.",
                R.drawable.artboardorange);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Jetsunma Tenzin Palmo","É importante que nós não nos identifiquemos tão fortemente com a nossa personalidade.É apenas uma máscara.Nós não temos que nos agarrar a essa máscara.Ela pode ser alterada.",
                R.drawable.artboardblue);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Chagdud Tulku Rinpoche","Tentar mudar o mundo sem mudar a nossa mente é como tentar limpar o rosto sujo que vemos no espelho esfregando o vidro.",
                R.drawable.artboardpink);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Kristin Neff","Autocompaixão envolve sermos gentis com nós mesmos, quando a vida dá errado ou quando notamos algo sobre nós que não gostamos, em vez de sermos frios ou severamente autocríticos. Ela reconhece que a condição humana é imperfeita, assim, nos sentimos conectados aos outros quando falhamos ou sofremos, em vez de nos sentirmos separados ou isolados.",
                R.drawable.artboardorange);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Richard J. Davidson, PhD","A neuroplasticidade nos informa que a mente e o cérebro são altamente mutáveis, e que o cérebro está constantemente sendo moldado pela experiência. O bem-estar é uma habilidade e pode ser melhorado através de treinamento.",
                R.drawable.artboardblue);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Sakyong Mipham","A coisa estranha sobre a preocupação é que ela realmente não ajuda. Ela agrava a situação. É difícil estar presente e confiante, porque estamos vivendo no futuro ou no passado em vez de estarmos no presente, o que só gera mais medo e preocupação.",
                R.drawable.artboardpink);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Thupten Jinpa","Lembre-se de todos os momentos em que você mais se sentiu feliz – eu aposto que o denominador comum é a habilidade de esquecer de si mesmo. É esse o paradoxo da felicidade. Se você realmente quer uma alegria verdadeira, você precisa soltar do senso de eu. E não há nada mais poderoso do que a experiência da compaixão para tornar isso possível. Então eu penso que essa é a razão pela qual a compaixão é a chave para a felicidade.",
                R.drawable.artboardorange);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Jetsunma Tenzin Palmo","Sabe, o apego é como segurar com bastante força. Mas o amor genuíno é como segurar com muita gentileza, nutrindo, mas deixando que as coisas fluam. Não é ficar preso com força. Porém é muito difícil para as pessoas entenderem isso, porque elas pensam que quanto mais elas se agarram a alguém, mais isso demonstra que elas se importam com o outro.” “Qualquer tipo de relacionamento no qual imaginamos que poderemos ser preenchidos pelo outro será certamente muito complicado.",
                R.drawable.artboardblue);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Alan Wallace","A chave para a transformação é continuidade.",
                R.drawable.artboardpink);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Tenzin Palmo no livro “No Coração da Vida”","“A meditação libera espaço na mente, nos dá espaço para a experiência. Normalmente, nossa vida é tão atravancada que não temos espaço nem para respirar. Mas a meditação nos dá espaço para respirar, de modo que as coisas podem surgir e, assim, o entendimento e a experiência podem aparecer.  (...) Em especial hoje em dia, o que não temos em nossa vida cotidiana é espaço, silêncio.  Meditação tem a ver com voltar ao nosso espaço silencioso interior”.",
                R.drawable.artboardorange);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Viktor Frankl","Quando a situação for boa, desfrute-a. Quando a situação for ruim, transforme-a. Quando a situação não puder ser transformada, transforme-se.",
                R.drawable.artboardblue);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Dzogchen Ponlop Rinpoche no livro \\\"Buda Rebelde\\\"","Geralmente, é durante os nossos esforços de ajudar os outros em suas confusões que vivenciamos alguma liberação de nossa própria confusão. Esse potencial para benefício mútuo está sempre presente.\\n\\nPor essa razão, não devemos sustentar a visão de que somos inteligentes e de que a pobre pessoa confusa na nossa frente não sabe de nada. Ao mesmo tempo, não devemos esperar qualquer resultado ou recompensa. Em resumo, compaixão genuína é algo livre de manobras.",
                R.drawable.artboardpink);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Thupten Jinpa no livro “Um coração sem medo”4","A compaixão é parte fundamental da natureza essencial do ser humano. A chave para a felicidade individual e o bem-estar da sociedade como um todo é entrar em contato com nossa parte compassiva e lidar com nós mesmos, com os outros e o mundo a partir dela.",
                R.drawable.artboardorange);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Jigme Khyentse Rinpoche","As pessoas costumam reclamar que a prática é difícil, que envolve muito esforço, podendo pensar que isso não é para elas… Mas a dificuldade não está na prática em si, está nos hábitos das pessoas. Pegue por exemplo os fumantes. Eles reclamam que não fumar é muito difícil. Para as pessoas que não fumam, não é nem um pouco difícil. É importante ter claro na mente que a dificuldade não está na prática, mas nos hábitos que fomos cultivando e que nos impedem de praticar.",
                R.drawable.artboardblue);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Jon Kabat-Zinn","Cultivar a meditação não é diferente do processo de fazer uma refeição. Seria absurdo propor que alguém comesse por você. E quando você vai a um restaurante, você não come o cardápio achando que é a comida, nem se alimenta apenas ouvindo o garçom descrevendo os pratos. Você precisa comer para poder se nutrir. Da mesma forma, você precisará praticar a meditação para poder colher os benefícios e compreender por que ela é tão valiosa.",
                R.drawable.artboardpink);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Dzongsar Khyentse Rinpoche","A maior parte do tempo estamos tentando fazer as coisas boas durarem, ou estamos pensando como substituí-las por algo ainda melhor no futuro, ou estamos atolados no passado, fazendo reminiscências sobre tempos mais felizes. Ironicamente, nunca apreciamos realmente a experiência pela qual somos nostalgicos, porque naquele momento estávamos ocupados demais nos apegando a esperanças e medos.",
                R.drawable.artboardorange);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("B. Alan Wallace","Nosso trabalho pode funcionar como um tipo de narcótico, encobrindo a inquietação e a turbulência das nossas mentes. E um estilo de vida que alterna muito trabalho com muita diversão pode nos manter constantemente ocupados, sem nunca termos qualquer pista sobre o verdadeiro significado da vida ou o potencial da consciência humana.",
                R.drawable.artboardblue);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Sam Harris no livro \\\"Despertar\\\"","Nossas mentes são tudo o que temos. Tudo o que já tivemos. E elas são tudo o que nós podemos oferecer aos outros... Cada uma das experiências que você já teve foi moldada pela sua mente. Cada relacionamento é tão bom ou tão ruim como é por causa das mentes envolvidas. Se você está perpetuamente nervoso, depressivo, confuso e desamoroso, ou se sua atenção está em outro lugar, não importa o quão bem-sucedido você se torne ou quem estiver em sua vida — você não aproveitará nada.",
                R.drawable.artboardpink);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Lama Tsering","É inacreditável o que fazemos em nossos relacionamentos. Damos ao outro a missão impossível de nos fazer felizes. Não estamos assumindo a responsabilidade de lidar com nossa própria mente. Esperamos que alguém preencha nossa felicidade e bem-estar.",
                R.drawable.artboardorange);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Thich Nhat Hanh","A nossa forma de agir depende da nossa maneira de pensar, e a nossa maneira de pensar depende das nossas energias. Quando reconhecemos isto, só temos de dizer: \\\" Olá, energia do hábito,\\\" e fazemos amizade com os nossos padrões e hábitos de pensamento e ação. Quando podemos aceitar estes pensamentos enraizados e não sentir-nos culpados por eles, eles vão perder grande parte do seu poder sobre nós.",
                R.drawable.artboardblue);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Phakchok Rinpoche","Eu rio de mim mesmo por criar emoções que me deixam chateado. Por favor, nem sempre acredite no que você sente.",
                R.drawable.artboardpink);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Matthieu Ricard no livro \\\"A arte de meditar\\\"","A meditação é um processo de formação e de transformação. Para ter sentido, ela deve se refletir em cada aspecto de nossa maneira de ser, em cada uma de nossas ações e atitudes. Se assim não for, será perda de tempo. Devemos, então, perseverar com serenidade, vigilância e determinação, e verificar que, com o passar do tempo, mudanças reais acontecem em nós.",
                R.drawable.artboardorange);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Matthieu Ricard","A cada hora, passe 10 segundos desejando que alguém seja feliz. É transformador.",
                R.drawable.artboardblue);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Bill Murray","Quanto mais relaxado você estiver, melhor você será em tudo. Melhor você será com aqueles que você ama, melhor você será com seus inimigos, melhor você será no seu trabalho, melhor você será com você mesmo.",
                R.drawable.artboardpink);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Dzigar Kongtrul Rinpoche","É um alívio quando percebemos que não é o mundo exterior que tem que mudar para que possamos estar em paz, mas é a nossa própria mente que tem que mudar.",
                R.drawable.artboardorange);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Tenzin Palmo no livro \\\"A caverna na neve\\\"","Quando pensamos em descansar, normalmente ligamos a TV ou saímos, tomamos um drinque. Mas isso não nos dá descanso real. Isso é apenas colocar mais informação para dentro. Para obter um verdadeiro relaxamento, precisamos nos dar algum espaço interno. Precisamos limpar o depósito de lixo, aquietar o ruído interior. E a maneira de fazer isso é manter a mente no momento. Isso é meditação. A mente relaxada e alerta. Cinco minutos dessa prática e você vai se sentir revigorado e desperto.",
                R.drawable.artboardblue);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Dzigar Kongtrul Rinpoche","Você pode notar algo irônico: sentado calmamente sozinho, você pode se sentir menos isolado do mundo do que você se sente quando está ocupado envolvido na agitação de sua vida diária.",
                R.drawable.artboardpink);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Lama Padma Samten","Um grande mestre japonês dizia: apenas sente. Quando a pessoa senta, todo o conjunto de referenciais e visões começa a acalmar. De repente, começa a ver as coisas de outro modo. Muda a perspectiva. Nossa mente funciona por excitação. Se você não coloca elementos novos, naturalmente ela vai acalmando. Se sentarmos em silêncio, nós progressivamente ganhamos liberdade interna diante desses pressupostos. Conseguimos olhar de forma mais livre para as nossas realidades.",
                R.drawable.artboardorange);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Chagdud Tulku Rinpoche","Somos todos como atores em uma peça de teatro que se confundiram com suas personagens; por isso, vemos uns aos outros como amigos ou inimigos. Uma vez que compreendamos isso, é irrelevante se as pessoas são conhecidas ou desconhecidas, feias ou bonitas, amáveis ou não.\\r\\n\\r\\nEm vez de classificar as pessoas, podemos aprender a superar os limites da nossa compaixão e a tratar todos os seres com a mesma bondade, com paciência e compaixão, ao invés de raiva ou apego.",
                R.drawable.artboardblue);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Shunryu Suzuki","Há muitas possibilidades na mente do principiante, mas poucas na do perito.",
                R.drawable.artboardpink);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Dzongsar Khyentse Rinpoche","Quando sentir raiva, apenas observe a raiva. Não a causa da raiva ou seu resultado, apenas a emoção da raiva. Ao encarar sua raiva, você descobrirá que não há nada que você possa apontar e dizer: “Aqui está minha raiva”. E a compreensão de que não há absolutamente nada ali é o que é chamado de “amanhecer da sabedoria",
                R.drawable.artboardorange);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Andrew Olendzki","Liberdade significa ser capaz de escolher como reagir às coisas. Quando a sabedoria não está bem desenvolvida, ela pode ser obscurecida pelas provocações dos outros. Podemos ser como animais. Se não há nenhum espaço entre o estímulo ofensivo e sua reação condicionada imediata (a raiva) então na verdade estamos sob o controle dos outros. Quando a sabedoria está lá para preenchê-lo, a pessoa é capaz de responder com paciência. Não é que a raiva seja reprimida, ela nem chega a surgir.",
                R.drawable.artboardblue);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Padampa Sangye (Índia, Tibete – séc. XII)","Saiba que se você não tiver contentamento com as coisas, irá se tornar um escravo do desejo!",
                R.drawable.artboardpink);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Alan Wallace","Quando derramamos água numa superfície de areia, todos sabemos o que acontece: a água desaparece. Na prática de shamatha com foco na respiração, deixe que todas as atividades mentais se dissolvam na areia do seu corpo. No século XXI, precisamos de grounding. Precisamos de relaxamento mais do que qualquer civilização na história da humanidade.",
                R.drawable.artboardorange);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Pico Iyer","Em algum ponto, todas as viagens horizontais pelo mundo param de compensar pela necessidade de ir mais fundo, em algum lugar desafiador e inesperado; o movimento faz mais sentido quando aterrado na quietude.\\r\\n\\r\\nNuma era de velocidade, eu começo a pensar, nada poderia ser mais revigorante quanto ir devagar. Numa era de distração, nada poderia ser mais luxuoso quanto prestar atenção. E numa era de constante movimento nada é mais urgente quanto se sentar quieto.",
                R.drawable.artboardblue);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Dalai Lama","Desde o nascimento, todos queremos viver uma vida feliz. No entanto, muitos compartilham a visão de que nossos sistemas educacionais existentes são inadequados quando se trata de preparar as pessoas para serem mais compassivas - uma das condições necessárias para ser feliz. Como um irmão humano, estou empenhado em fazer pessoas saberem que todos possuímos as sementes do amor e da compaixão. Ter um cérebro inteligente não é suficiente; Também precisamos de um coração acolhedor.",
                R.drawable.artboardpink);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Mahatma Gandhi","A liberdade exterior que conseguiremos depende exatamente do grau de liberdade interior que possamos ter desenvolvido num dado momento.\\r\\nE, se essa é uma visão correta da liberdade, nossa principal energia deve ser concentrada em obter a reforma interior.",
                R.drawable.artboardorange);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Ringu Tulku","Quando, surgir raiva ou desejo intenso, não rejeite nem suprima, mas também não as siga. Apenas olhe para a emoção, olho no olho, e tente relaxar dentro da própria emoção. Não há confronto envolvido.  Permanecendo desapegado, você nem é carregado pelo emoção nem a rejeita. Então, você pode olhar para suas aflições quase casualmente e até se divertir com isso. Quando se vai nosso hábito de magnificar nossos sentimentos e a fascinação resultante disso, não haverá nenhuma negatividade.",
                R.drawable.artboardblue);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Pema Chodron no livro \\\"Quando tudo se desfaz\\\"","Em vez de lutar contra a força da confusão, podemos nos encontrar com ela e relaxar. Quando fazemos isso, gradualmente descobrimos que a claridade está sempre lá. No meio do pior cenário da pior pessoa do mundo, no  meio de todo o pesado diálogo com nós mesmos, o espaço aberto está sempre lá.",
                R.drawable.artboardpink);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Alan Wallace","Quando escolhemos a respiração como foco para a prática da meditação, os pensamentos, as imagens, as memórias, os impulsos, todos esses eventos mentais continuam surgindo. Antes que sejamos carregados por eles, podemos simplesmente soltá los, sem qualquer esforço. A imagem que mais gosto de usar é a de uma criança soltando balões no ar. Não é preciso empurrá-los e nem cortar os fios. Basta soltá-los, alegremente!",
                R.drawable.artboardorange);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Tenzin Palmo no livro “No Coração da Vida”","“A verdadeira segurança provém apenas do conforto com a insegurança. Ficarmos à vontade com o fluxo das coisas, ficarmos à vontade ao estarmos inseguros, essa é a maior segurança, pois nada pode nos tirar do prumo. Enquanto tentamos solidificar, parar o fluxo da água, represá-la, manter as coisas do jeito que elas são, porque isso nos faz sentir seguros e protegidos, estamos enrascados. Essa atitude vai direto de encontro a todo o fluxo da vida”.",
                R.drawable.artboardblue);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("B. Alan Wallace","Uma mente que busca em outras pessoas e em outros lugares algo que falta em si mesma é uma mente que ignora seus próprios recursos de paz e felicidade.",
                R.drawable.artboardpink);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Chogyam Trungpa","Geralmente, se você tem um falatório mental, chama isso de pensamentos. Mas se está profundamente envolvido em algo emocional, você dá prestígio especial a isso. Pensa que esses merecem o privilégio especial de serem chamados de “emoção”. No que concerne à prática da meditação, seus pensamentos não são mais tratados como VIPs, enquanto você medita. Você pensa, você medita; você pensa, você medita. Deixe que seja assim. Chame-os de pensamentos.",
                R.drawable.artboardorange);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Thich Nhat Hanh","Você não sofre porque as coisas são impermanentes. Você sofre porque as coisas são impermanentes e você pensa que elas são permanentes.",
                R.drawable.artboardblue);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Phakchok Rinpoche","Meu conselho é muito simples. Não dê muita bola pros seus sentimentos. Por exemplo, muitas vezes você realmente não quer sentar e praticar meditação... Apenas sente!  Atravesse os sentimentos que você tem que estão dizendo \\\"Eu quero isso\\\" ou \\\"Eu não quero isso\\\". Atravesse todo o bloqueio. Assim você se torna mais você mesmo. Você se torna digno, porque VOCÊ tomou controle de sua vida, não os seus sentimentos.",
                R.drawable.artboardpink);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("B. Alan Wallace","Se você estiver meditando e surgir uma imagem ou desejo desagradável, não tem problema. Nenhum mal acontece pela presença de pensamentos negativos, se você não se fixar neles. O problema é uma conscientização pegajosa que se fecha sobre os pensamentos negativos do tipo “Oh, como posso pensar nisso… mas gosto de pensar… mas não deveria…” A identificação, a fixação é o problema, não os pensamentos em si.",
                R.drawable.artboardorange);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Elizabeth Mattis Namgyel","O maior respeito que nós podemos prestar a alguém é não pensar que sabemos quem ele é.",
                R.drawable.artboardblue);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Dzongsar Khyentse Rinpoche","Quando estamos falando de prática, tão logo alguma coisa contrarie o desejo de seu ego, isso se torna uma prática. E, para isso, a meditação é muito importante, porque a meditação — principalmente shamatha — isola o ego de suas distrações. Isolamento é a última coisa que o ego quer, porque o ego é fundamentalmente infeliz sobre sua condição. A própria natureza do ego é a insegurança: insegurança sobre sua própria identidade e existência.",
                R.drawable.artboardpink);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Chagdud Tulku Rinpoche no livro “Para abrir o coração”","A fonte de todas as dificuldades e conflitos está na mente; portanto, a solução de todas as dificuldades e conflitos está na transformação da mente. Para isso, praticamos a meditação.",
                R.drawable.artboardorange);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Dalai Lama","Como todo mundo eu também tenho a raiva em mim. Porém, eu tento me lembrar que a raiva é uma emoção destrutiva, que os cientistas dizem que a raiva é ruim para nossa saúde; que ela acaba com nosso sistema imunológico. Então a raiva destrói nossa paz de espírito e nossa saúde física. Nos não deveríamos dar boas vindas à ela, nem pensar nela como sendo natural e nem como sendo uma amiga.",
                R.drawable.artboardblue);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Chogyam Trungpa","A meditação não é um sedativo, é um laxante.",
                R.drawable.artboardpink);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Mingyur Rinpoche","Podemos olhar diretamente para as emoções perturbadoras e outros problemas que enfrentamos em nossas vidas como trampolins para a liberdade. Em vez de rejeitá-los ou entregarmo-nos a eles, podemos fazer amizade e trabalhar com eles para chegar a uma experiência autêntica e duradoura da nossa sabedoria, confiança, clareza e alegria inerentes.",
                R.drawable.artboardorange);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Dalai Lama","A raiva e o ciúme estão relacionados ao nosso auto-centramento e ao nosso desrespeito pelos outros. O auto-centramento, facilmente, faz brotar medo, o que favorece a irritação, e que, quando explode em raiva, pode provocar a violência. Chegou a hora de aceitarmos que, se estamos falando de paz mundial, devemos levar em consideração a paz dentro de nós mesmos.",
                R.drawable.artboardblue);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Mingyur Rinpoche","“No fim das contas, a felicidade se limita à escolha entre o incômodo de se tornar consciente das aflições mentais e o desconforto de ser guiado por elas “",
                R.drawable.artboardpink);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Sêneca","Não é porque certas coisas são difíceis que nós não ousamos. É porque não ousamos que são difíceis.\\\"&nbsp;&ndash",
                R.drawable.artboardorange);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("B. Alan Wallace","O ponto da meditação não é parar de pensar. O que precisa ser interrompido é a conceituação compulsiva, mecânica e pouco inteligente, isto é, essa atividade sempre fatigante, geralmente inútil e, às vezes seriamente prejudicial.",
                R.drawable.artboardblue);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Nagarjuna (filósofo indiano 150~250)","A vida tremeluz com as investidas de mil doenças, Mais frágil que uma bolha num córrego. Durante o sono, cada respiração vai e de novo vem; Que maravilha acordarmos vivos ainda!",
                R.drawable.artboardpink);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Patrul Rinpoche (1808-1887)","Respirando gentilmente, as pessoas aproveitam o repouso. Mas entre uma respiração e a próxima não há garantia que a morte não vá se intrometer. Acordar com boa saúde é um evento que merece de verdade ser considerado milagroso, mas ainda assim tomamos isso como algo totalmente garantido.",
                R.drawable.artboardorange);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Dalai Lama","Uma mente saudável é a verdadeira chave para a felicidade. Nós gastamos tanta energia com a saúde física e higiene, mas precisamos passar também mais tempo fazendo a higiene mental e a higiene da emoção.",
                R.drawable.artboardblue);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass(" ","Há um velho koan sobre um monge que foi até seu mestre e disse: – Sou uma pessoa com muito raiva. Quero que você me ajude.O mestre falou: – Me mostre sua raiva. O monge respondeu: – Bem, no momento não estou nervoso. Não posso mostrá-la. E o mestre: – Então, obviamente, isso não é você, já que às vezes a raiva nem está aí. Quem somos tem muitas faces, mas essas faces não são aquilo que somos.",
                R.drawable.artboardpink);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Dalai Lama","Compaixão traz paz de espírito. Isso coloca um sorriso no nosso rosto e sorrisos genuínos nos aproximam. A educação hoje não precisa apenas desenvolver a nossa inteligência, mas também apoiar valores humanos básicos como um coração amoroso e compaixão. Estas não são qualidades confinadas aos religiosos, porque, como seres humanos, todos queremos paz de espírito.",
                R.drawable.artboardorange);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Kosho Uchiyama","Você deve tentar encarar tudo que lhe ocorre na mente apenas como uma secreção. Nossos pensamentos e sentimentos são um tipo de secreção. Sempre tive coisas surgindo em minha cabeça, mas se eu tentasse agir em tudo que me ocorresse, isso iria apenas me esgotar. Você já teve a experiência de estar em um lugar alto e sentir um impulso de pular? Aquele impulso de pular é apenas uma secreção na sua cabeça. Mas se você acredita que precisa seguir cada impulso que surge na mente, bem…",
                R.drawable.artboardblue);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Jetsunma Tenzin Palmo","Contentamento hoje em dia, em nossa sociedade moderna, ou é ignorado completamente ou é ridicularizado, porque se estamos contentes não vamos consumir.",
                R.drawable.artboardpink);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Dzigar Kongtrul Rinpoche","Observar nossa mente pode ser mais agradável do que assistir a um filme de Hollywood. A tela, o projetor, a história, os personagens e o drama estão todos na nossa própria experiência. Uma produção de teatro tão fantástica não poderia ser comprada por milhões de dólares. Nosso ingresso neste teatro é \\\"ver além\\\": ver que os fenômenos não existem como aparecem.",
                R.drawable.artboardorange);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Dalai Lama","É importante entender como funcionam nossa mente e nossas emoções. Uma causa e condição da raiva é o medo. Uma vez que tenha surgido a raiva pode levar ao ódio, então precisamos trabalhar com ela assim que aparecer. A raiva tende a surgir espontaneamente, mas podemos desenvolver a compaixão através do treinamento. A raiva pode trazer energia, mas o problema é que é uma energia cega. Cuidamos da nossa higiene física para manter nossa saúde, precisamos, também, é de higiene emocional.",
                R.drawable.artboardblue);
        this.listaArtigos.add(artigo);







    }

}
