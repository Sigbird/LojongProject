package com.example.lojongproject.abas;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lojongproject.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Artigos extends Fragment {

    private List<ArtigosClass> listaArtigos = new ArrayList<>();

    public Artigos() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_artigos, container, false);
        // Inflate the layout for this fragment

        RecyclerView recyclerView = (RecyclerView) root.findViewById(R.id.listaview);

        CriarArtigos();

        AdapterArtigos adapter = new AdapterArtigos(listaArtigos);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

        return root;
    }

    public  void CriarArtigos(){

        ArtigosClass artigo =  new ArtigosClass("Quem é você? - do livro \\\"Apaixonado pelo mundo\\\" de Mingyur Rinpoche","Geralmente, não reconhecemos que nossa identidade social é moldada e limitada pelo contexto, e que essas camadas externas de nós mesmos existem dentro de uma realidade ilimitada. Padrões habituais encobrem essa realidade ilimitada, a obscurecem, mas ela está sempre lá, pronta para ser desvelada.", R.drawable.article_98);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("A libertação dos pensamentos","Falamos muito da possibilidade de mudança. Como isso acontece no contexto da formação contemplativa?", R.drawable.article_iamgeartigo2);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Por que achamos difícil meditar?","O que existe em algo tão simples como sentar-se em silêncio e observar a respiração que nos evoca pânico, medo e até mesmo hostilidade?", R.drawable.article_farola);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Aprendendo a meditar através da dificuldade","Ed Halliwell, professor de mindfulness, conta como chegou à meditação depois de lidar com a ansiedade e a depressão.", R.drawable.article_difc);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Como impedir que suas histórias comandem a sua vida","Pesquisas mostram que temos a capacidade não somente de parar a tagarelice das nossas histórias, como podemos também reduzir nosso stress, refazer nossas conexões cerebrais e reinventar nossas relações por meio de responder a elas de modo diferente.", R.drawable.article_img222);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Meditação: Pegar e Soltar","Dzogchen Ponlop Rinpoche fala sobre como podemos nos relacionar com nossos pensamentos durante a meditação.", R.drawable.article_thumbmeditardzong);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Meditação e a ciência do bem-estar: entrevista com Cortland Dahl","Em sua primeira visita ao Brasil, o diretor-chefe do Center for Healthy Minds nos fala um pouco sobre a prática de mindfulness e sua relação com o cultivo do bem-estar sob o ponto de vista científico.", R.drawable.article_47);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Estar presente: o cultivo da atenção na era da distração – Trecho do livro de Alex Castro","Em seu novo livro “Atenção – Por uma política do cuidado” o escritor e zen-budista Alex Castro analisa as diferentes maneiras pelas quais podemos exercitar a atenção, não em busca do próprio autodesenvolvimento, mas sim no cuidado com o outro e também como instrumento de ação política.", R.drawable.article_491);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Como relaxar em atenção plena","Muitas vezes a nossa atenção plena se torna focada demais, espremida demais. Atenção espremida, certo? Quando você foca demais em atenção plena, na verdade isso pode as vezes ser contraproducente.", R.drawable.article_54);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Estamos viciados em buscar sentimentos?","Dzigar Kongtrul Rinpoche reflete sobre como podemos nos viciar em perseguir sentimentos agradáveis e como podemos cultivar uma visão que é mais ampla do que isso.", R.drawable.article_56);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Estes não são “seus” pensamentos","O professor de meditação de insight Joseph Goldstein explica como tratar a consciência como objeto de meditação", R.drawable.article_57);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Como a “Chuva” pode te nutrir","Jack Kornfield nos ensina a transformativa prática de atenção plena conhecida como “Chuva”", R.drawable.article_58);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("A Ciência da Meditação","Não tem sido fácil demonstrar os benefícios da meditação em termos concretos. No entanto, conforme o mundo científico se aprofunda nos estudos da atenção plena, a capacidade do cérebro de se transformar sob sua influência inspira e fascina.", R.drawable.article_59);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("A resposta para raiva e agressão é paciência","Podemos reprimir a raiva e a agressão ou agir de qualquer forma, tornando as coisas piores para nós mesmos e para os outros. Ou podemos praticar a paciência: espere, experimente a raiva e investigue sua natureza. Pema Chödrön nos leva passo a passo através desta prática poderosa.", R.drawable.article_60);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Esqueça a felicidade!","Comentários em dois versos das Trinta e Sete práticas do Bodhsattva, de Tokme Zongpo.", R.drawable.article_61);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Coração amoroso universal e responsabilidade universal","Como seres humanos, compartilhamos em comum o nosso coração amoroso universal. Podemos pensar em nós mesmos como separados dos outros e os outros podem pensar em si mesmos separados de nós. No entanto, todos somos iguais", R.drawable.article_62);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Como algumas pessoas podem ser bondosas e ativamente fazer o mal?","Geshe Tenzin Wangyal Rinpoche, Zenkei Blanche Hartman e Narayan Helen Liebenson respondem a questão de um leitor.", R.drawable.article_63);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("O Corpo Equilibrado e o Caminho do Meio","Enquanto tensão e desequilíbrio se manifestam como discursividade, um corpo verdadeiramente equilibrado e relaxado é a base natural para uma mente desperta.", R.drawable.article_64);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("A importância da liberdade e do compromisso nos relacionamentos íntimos","Quer você acredite em ter mais liberdade ou mais comprometimento em seus relacionamentos íntimos, o desejo está envolvido e se trata de uma questão de coração para coração.", R.drawable.article_65);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Cidades Internas","Com seus vizinhos barulhentos e moradores de rua acampados nas esquinas, a vida na cidade nos oferece várias oportunidades para a prática da gentileza. Dzigar Kongtrül Rinpoche fala sobre como a vida urbana pode abrir nossos corações.", R.drawable.article_66);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Usando Atenção Plena para a Saúde Mental","Uma conversa com Patrícia Rockman sobre quando a prática de atenção plena deveria ou não ser usada como tratamento para nossa saúde mental.", R.drawable.article_67);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Estudo revela que falar muito sobre si mesmo pode ser um indício de problemas emocionais","É mais provável que ficar falando sobre si mesmo seja um indício de problemas emocionais ao invés de mero narcisismo. Quão comumente você se pega falando “eu”?", R.drawable.article_68);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Acalmando o fogo ardente da raiva","A raiva pode ser nossa ruína, mas, segundo o psiquiatra Jeffrey Brantley, não é preciso que seja assim.", R.drawable.article_69);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("A Neurociência tem muito a aprender com o Budismo","O monge Matthieu Ricard conversa com o neurocientista Wolf Singer sobre meditação, terapia e seus efeitos no cérebro.", R.drawable.article_70);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Cinco estratégias psicológicas para suavizar o estress do perfeccionismo","Nos últimos três meses, tenho tentado uma experiência. É algo que nunca fiz antes e de certa forma tem sido um grande desafio. No entanto, de outras formas, tem sido um enorme alívio do estresse, e eu diria um esforço bem-sucedido. O que eu fiz parece ir contra a sabedoria convencional, mas isso não significa", R.drawable.article_71);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Tédio, Meditação e Criatividade","Charles Hastings, instrutor do aplicativo Imagine Clarity, fala sobre a relação entre criar espaços em meio a rotinas ocupadas e a criatividade.", R.drawable.article_72);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Deixando a margem da ilusão","Quando criança, a praticante budista Leslie Davis escapava da sua dolorosa realidade sonhando acordada. Através da meditação, ela aprendeu a resistir ao ímpeto de escapar para dentro de sua mente e a focar no momento presente.", R.drawable.article_73);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Porque a verdadeira felicidade não se trata de estar feliz o tempo todo","A psicóloga Lowri Dowthwaite explica como o movimento da psicologia positiva vem mostrando que a felicidade não se trata de algo estável e imutável.", R.drawable.article_74);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("O que a meditação não pode curar","A meditação não foi desenhada para curar feridas psicológicas precoces, explica Debra Flics. Ela nos alerta a não olharmos para a meditação como um substituto para a psicoterapia.", R.drawable.article_75);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Morte: a grande professora","O Buda disse que o maior ensinamento de todos é a impermanência. Sua expressão final é a morte. A professora budista Judy Leif explica porque a consciência da morte é o segredo da vida. É a última reviravolta.", R.drawable.article_76);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Monja budista explica: o que é raiva e o que não é","Criar uma vida livre da raiva é uma responsabilidade individual que tem consequências profundas e imediatas em todos os nossos relacionamentos. A chamada “agressão passiva” – manipular, banalizar, evitar, ignorar – é tão prejudicial quanto e muito mais fácil de negar. As palavras imensamente valiosas abaixo sobre o assunto vêm da freira budista e ativista social, Robina Courtin.",
                R.drawable.article_77);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Venenos mentais, relacionamentos e a importância da meditação","O jovem mestre budista Karmapa ensina de maneira simples e objetiva sobre estes",
                R.drawable.article_78);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Treine seu cérebro","Richard Davidson, neurocientista e fundador do Center for Healthy Minds, junta-se ao correspondente da ABC News, Dan Harris, para uma conversa sobre ciência e bem-estar.",
                R.drawable.article_79);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Você não é as suas reações – Parte 1","É muito importante reconhecer que as reações que sentimos não são necessariamente quem somos. Essas reações que parecem parte de nós – como reagimos – são muito sobre quem éramos como seres no passado.",
                R.drawable.article_80a);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Você não é as suas reações – Parte 2","Como Shantideva diz no Caminho do Bodhisattva, quando alguém vai para a guerra, eles estudam seu oponente. É assim que temos que estudar nossas emoções perturbadoras. Esses “venenos” são, de certa forma, nada além de nossas próprias reações.",
                R.drawable.article_81a);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Você não e as suas reações – Parte 3","Em vez de suprimir ou fugir de nossas emoções, elas podem se tornar o estímulo para nossa própria vigília. E permanecendo presentes às sensações que estão ligadas às nossas reações, podemos realmente nos tornar como um guerreiro, confiante e autêntico.",
                R.drawable.article_as82);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Uma meditação de reconciliação","A ansiedade muitas vezes envolve sentimentos de separação e isolamento, tornando quase impossível ficar à vontade e sentir-se seguro em sua própria carne e ser.",
                R.drawable.article_83);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("A pergunta sobre progresso","Como em qualquer tentativa artística, a meditação é uma questão de prática.",
                R.drawable.article_84);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Menos empatia, mais bondade","A diferença entre empatia e compaixão e porque isso importa.",
                R.drawable.article_85);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Como cérebros felizes respondem a coisas negativas","Pesquisas recentes fornecem uma total nova compreensão da amígdala cerebral – e sugere que pessoas felizes tomam o mau com o bom.",
                R.drawable.article_86);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Por que é importante meditar?","O que significa meditação? Como podemos começar a treinar nossa mente?",
                R.drawable.article_88);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("A prática do morrer","Como podemos morrer com dignidade?\\r\\nEsta é uma questão muito importante para todos nós.",
                R.drawable.article_89);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Yuval Noah Harari, autor de “Sapiens” fala sobre sua prática de meditação","O autor fala como a prática da meditação nos leva a observar a realidade com maior clareza.",
                R.drawable.article_90);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("A ilusão do “eu”","De acordo com o budismo, nossa visão do eu como uma entidade singular, distinta, autônoma e duradoura está em desacordo com a realidade e portanto torna-se uma fonte de frustração e sofrimento.",
                R.drawable.article_91);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Ficando desemperrado: Afogando-se em familiaridade","Parece que, semana após semana, nós praticamente sentimos o mesmo, apesar de muitas coisas acontecerem em uma semana. E esse sentimento de mesmice está intimamente ligado à sensação de estar emperrado.",
                R.drawable.article_96);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("William James sobre a Psicologia do Hábito","“Estamos girando nossos próprios destinos, bons ou maus, nunca poderão ser desfeitos. Cada menor golpe de virtude ou de vício deixa sua cicatriz nunca tão pequena”",
                R.drawable.article_articlewilliam);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Vivendo plenamente com a mudança e a incerteza","Sem as palavras, sem os pensamentos repetitivos, as emoções não duram mais que um minuto e meio. Como soltamos as histórias que contamos a nós mesmos?",
                R.drawable.article_iamgeartigo3);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Felicidade genuína: o que é? Onde encontrá-la?","Todos buscamos ser felizes. Isto é um fato. Porém, será que estamos buscando felicidade na direção que irá produzi-la?",
                R.drawable.article_fgbarco);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Por que precisamos de um grupo?","É por meio do contato direto com professores e com outros praticantes que temos a oportunidade de contemplar nossas experiências e ultrapassar os limites impostos por uma prática isolada, separada da realidade à nossa volta.",
                R.drawable.article_55);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Acalmando a mente do “agora não”","Dicas de meditação para procrastinadores e perfeccionistas.",
                R.drawable.article_imageartigo4);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Compaixão: nosso primeiro instinto","A ciência mostra as práticas de meditação que podem ajudar a cultivar a compaixão e contribuir para um maior bem-estar em nossas vidas.",
                R.drawable.article_imageartigo1);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Feedback da realidade","Nosso sofrimento é didático: dói onde estou fixado, dói quando ajo com raiva, dói quando ignoro a impermanência…",
                R.drawable.article_artigogitt);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("A Ciência da Meditação","Não tem sido fácil demonstrar os benefícios da meditação em termos concretos. No entanto, conforme o mundo científico se aprofunda nos estudos da atenção plena, a capacidade do cérebro de se transformar sob sua influência inspira e fascina.",
                R.drawable.article_ciencimed);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("4 exercícios simples para reforçar sua atenção e reduzir a distração","Nossa atenção é raptada por tudo, do estresse de nossas vidas ao toque dos nossos telefones. A neurocientista Amishi Jha nos mostra como podemos cultivar a habilidade de focar no que realmente importa.",
                R.drawable.article_atencaothumb);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Como avaliar se uma prática de meditação é boa ou não?","É muito fácil avaliar a meditação com base em o quanto você se sente enquanto está meditando, mas essa não é uma avaliação muito útil.",
                R.drawable.article_33);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Como seu cérebro se altera quando você medita","Ao criar novos caminhos no cérebro, a meditação pode transformar uma mente caótica em uma mais calma.",
                R.drawable.article_imagemartigo5);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("É possível amar sem apego?","Se há alguma alegria em nosso relacionamento, é por causa do amor. Se há raiva, mágoa, inveja e todo o resto, é o resultado do apego.",
                R.drawable.article_loveee);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Autocompaixão, Autoestima e Autocrítica","Kristin Neff fala sobre as dificuldades geradas pela autocrítica e sobre como a autocompaixão se trata da alternativa perfeita para os problemas gerados pela autoestima.",
                R.drawable.article_autocompthunb);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Por que o amor-bondade requer tempo","Apenas depois de praticar muito é que começamos a perceber o hábito desenvolver-se: quer dizer, permitirmo-nos ser livres de vez em quando.",
                R.drawable.article_sharonmo);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Ninguém precisa ser especial: nos libertando da prisão da auto-imagem","Muito da nossa vida é gasta tentando se viver das auto-imagens, e raramente nós temos a disposição de olhar para elas honestamente.",
                R.drawable.article_amindfll);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("As faces frágeis da identidade","A palavra “personalidade” vem de persona, que significa “máscara” em latim. Mas enquanto o ator sabe que usa uma máscara, nós costumamos esquecer de separar entre o papel que desempenhamos na sociedade e a nossa verdadeira natureza.",
                R.drawable.article_maskk);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("O relato de um retiro de 10 dias de meditação","A história de uma aventura que desafia os limites do corpo e da mente. Eliane Brum fez um retiro de meditação de dez dias, no interior do Rio de Janeiro.",
                R.drawable.article_limite);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Acordando para o seu mundo","Ao longo do dia, você pode parar e acordar para a mágica do mundo ao seu redor. Pema Chödrön fala sobre como esse tipo de prática de atenção plena, ampla e acessível, é a coisa mais importante que podemos fazer em nossas vidas.",
                R.drawable.article_pemaatricle);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Uma prática de atenção plena que você pode tentar hoje: deixar ir!","O passado dói e gatilhos emocionais possuem um modo de nos manter presos em nossos caminhos. A prática de deixar que tudo se vá nos ajuda a seguir em frente.",
                R.drawable.article_baloon);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Tudo muda, até o “eu” muda","A medida que contemplamos a enorme variedade de fatores que devem se unir para produzir um senso específico de individualidade, nosso apego a esse “eu” que achamos que somos começa a se desfazer.",
                R.drawable.article_dentedele);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Criando Espaço","Phakchok Rinpoche nos ensina uma prática simples e acessível para o cultivo de uma mente ampla como o céu.",
                R.drawable.article_32a);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("O poder da solitude","Passar tempo sozinho com nós mesmos pode não ser fácil ou desejável. Mas é fundamental para conhecer quem realmente somos.",
                R.drawable.article_solitn);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Como ultrapassar o estresse por meio de enxergar a alegria dos outros","Se você se sente estressado ou sobrecarregado, não se isole das outras pessoas, diz Kelly McGonigal. Ao invés disso, dobre a sua capacidade de criar novas conexões.",
                R.drawable.article_empke);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Seriam as nossas memórias ilusões?","Nós tomamos as nossas memórias como gravações perfeitas dos fatos que ocorreram em nossa vida. Mas e se ao invés de gravações perfeitas do que vivenciamos, elas fossem em sua maioria meras histórias fictícias que contamos a nós mesmos numa tentativa de dar sentido às situações da nossa vida? Quem faz esse questionamento é a neurocientista e psicóloga criminal Julia Shaw.",
                R.drawable.article_memonydani);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Uma prática antidepressiva clássica e natural","O psicólogo Elisha Goldstein fala sobre como a prática de atenção plena pode ajudar no tratamento da depressão.",
                R.drawable.article_antidpreess);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("Como o treinamento em meditação transforma o cérebro, o indivíduo e a sociedade em geral","A neurocientista social Dra. Tania Singer fala sobre suas pesquisas e descobertas relacionadas ao treinamento da mente.",
                R.drawable.article_art1);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClass("A sobrevivência do mais bondoso","Sem compaixão nós não sobreviveríamos. Ainda assim, nem sempre é fácil trazer a compaixão para a nossa vida diária. Aprenda a fortalecer o seu músculo da empatia com essas 11 dicas e insights.",
                R.drawable.article_sobrevivenciabondoso);
        this.listaArtigos.add(artigo);


    }

}
