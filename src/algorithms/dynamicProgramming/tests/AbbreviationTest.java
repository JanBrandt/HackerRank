package algorithms.dynamicProgramming.tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import algorithms.dynamicProgramming.Abbreviation;

/**
 * @author Jan Brandt
 * @version 0.9 26/01/2018 Contains tests for the Abbreviation-Problem from
 *          HackerRank
 */
public class AbbreviationTest {

  @Test
  public void testAbbreviationSample() {
    String a = "daBcd";
    String b = "ABC";
    Abbreviation ab = new Abbreviation();
    assertEquals("Sample", true, ab.abbreviation(a, b));
  }

  @Test
  public void testAbbreviationOnlyLC() {
    String a = "afz";
    String b = "AFZ";
    Abbreviation ab = new Abbreviation();
    assertEquals("Only lowercase", true, ab.abbreviation(a, b));
  }

  @Test
  public void testAbbreviationMissingSingleChar() {
    String a = "afz";
    String b = "AFZC";
    Abbreviation ab = new Abbreviation();
    assertEquals("MissingSingleChar", false, ab.abbreviation(a, b));
  }

  @Test
  public void testAbbreviationAlternating() {
    String a = "faDfaBeqZfsDokfZabzUqrzebniAasd";
    String b = "FDFBEZFDFZBUIAS";
    Abbreviation ab = new Abbreviation();
    assertEquals("Alternating", true, ab.abbreviation(a, b));
  }

  @Test
  public void testAbbreviationSample10() {
    Abbreviation ab = new Abbreviation();
    String a = "SGFRHHRTUNXWPSMCEPQVUMRFAPAGREOVDRAUEGIQMGIDEWDNZRTUKLFQFFNIYHZ"
        + "FXSRMNIFVYZCUIOUXPYILVDYZPJAMPJZWVHZOGJIDHUBSHGGAKMPVGCUVUUOQMXEEZSE"
        + "QLJBAKMZDgxshpoqdprlsdtyyfagfltxdkhxtophvvkzvjxybzjyqcvqxilizrebbbgz"
        + "qbcoqinrvyvsdrxgsieswsrbqxqalattwebmuviogrqhyjucdiqdbuplinbiegmfslco"
        + "xjoabaeomkbejibmjxqiogwkoupmgohvxdksnsdapfdghehpcenhlsxzxljvdtosgmzd"
        + "eezvblqspvzlchkhnnjjevdciolawfqqixyorlbbgmcxmzukndgfztsjvqzjppwpgoky"
        + "goqhwbexxnzivsvocsjcvlubinqgfrfbqagornokxauxjlucidtzmtpabttntxtdpcbt"
        + "jmvfghhjtmquknzzeqmdueqxuoqhodochabdnorbnvjjjapqbuwagdmddgktfyirvctq"
        + "umxvzahswtzoxsjxsmsydlpvkuchponglncfycqepjsqcawvuysxazalodlcfjrlzzbk"
        + "plbtg";
    String b = "SGFRHHRTUNXWPSMCEPQVUMRFAPAGREOVDRAUEGIQMGIDEWDNZRTUKLFQFFNIYHZ"
        + "FXSRMNIFVYZCUIOUXPYILVDYZPJAMPJZWVHZOGJIDHUBSHGGAKMPVGCUVUUOQMXEEZSE"
        + "QLJBAKMZD";
    assertEquals("Sample 10.1", true, ab.abbreviation(a, b));
  }

  @Test
  public void testAbbreviationProblemCases() {
    Abbreviation ab = new Abbreviation();
    String a = "aAbB";
    String b = "AB";
    assertEquals("Problem Case 1", true, ab.abbreviation(a, b));

    a = "ANzaNanaanAZ";
    b = "ZANANAANAA";
    assertEquals("Problem Case 2", false, ab.abbreviation(a, b));
  }

  @Test
  public void testAbbreviationSample12() {
    Abbreviation ab = new Abbreviation();
    String a = "hHhAhhcahhacaccacccahhchhcHcahaahhchhhchaachcaCchhchcaccccchhhc"
        + "aahhhhcaacchccCaahhaahachhacaahhaachhhaaaCalhhchaccaAahHcchcazhachhh"
        + "aaahaahhaacchAahccacahahhcHhccahaachAchahacaahcahacaahcahacaHhccccaa"
        + "haahacaachcchhahhacchahhhaahcacacachhahchcaAhhcaahchHhhaacHcacahaccc"
        + "caaahacCHhChchhhahhchcahaaCccccahhcaachhhacaaahcaaaccccaacaaHachaahc"
        + "chaahhchhhcahahahhcaachhchacahhahahahAahaAcchahaahcaaaaahhChacahcaca"
        + "chacahcchHcaahchhcahaachnachhhhcachchahhhacHhCcaHhhhcaCccccaaahcahac"
        + "ahchahcaachcchaachahhhhhhhhcahhacacCcchahccaaaaaHhhccaAaaaCchahhccaa"
        + "hhacaccchhcahhcahaahhgacahcahhchcaaAccchahhhaahhccaaHcchaccacahHahCh"
        + "achhcaaacAhacacaacacchhchchacchchcacchachacaahachccchhhaccahcacchacc"
        + "aahaaaccccccaaaaaaaHhcahcchmcHchcchaaahaccchaaachchHahcaccaaccahcaca"
        + "cahAhaacaacaccaccaaacahhhcacAhaCchcaacCcccachhchchcchhchahchchahchch"
        + "hchcacaachahhccacachaAhaaachchhchchchhaachahaahahachhaaaccacahhcacch"
        + "hhaaachaaacAahhcachchachhhcacchacaaChCahhhccahChaachhcahacchanaaacch"
        + "hhccacacchcahccchAcahacaaachhacchachccaaHacaacAhahcCh";
    String b = "HAHHCHAACCCAHCHHAHHAHCACCHCCHHCAAHHCACCCAHHHACAAHHHHCHHCAHHAHHA"
        + "AAHAACAAHAHHCAHAHACHACHCHACACHAAHHAAAHCAHHACACAACHHHCHAHCAHCHHHAHAHA"
        + "CCAAAHCHHCHHCCAACCCCAACHACAACAAHACHCHAHHACCHCAHHHAAACHACAACHCACACAHH"
        + "CCHAHACCCACCAACHCHHHCCCCCHCCAHHCAAHHAHHHHHHHAACCCCAHCCAAAAAHHHAAAACC"
        + "AHHCAHACACCHHCHAHAHHCHAACHHHHHCCHCCAHAHCHCAAACCACCCCHACCACHHACHHACAC"
        + "HACCAACCCCAAAAHHAHCHHHCCAHCCHACHHAHCCACACCHAHAAACACCCCAHCCAHACCCCCCH"
        + "CCHHCHHHHCHCHCAHHHACHAHAACCCAAAACHAACAAAHHAAHAAAHACHHCACHCCHCHAACHAC"
        + "ACHHCCCCCAHCACHAAAHCHCAHACAAC";
    assertEquals("Sample 12.1", true, ab.abbreviation(a, b));

    a = "XbxxobxBobbbxooXobXxxBOXoOboxxbobXOoBbxbXooXBboxooOxxXbboxoOxlobbObbXo"
        + "XXbbXobbbXoxbxXBxoobooxbxoxoxOxxOxbxbxXobbbbBbxoxoooxooobXxbooBbOXxX"
        + "xbxqobbbboXxoXXbbbxObXXxobOXXOxoOoxoXOXBxOxBoxbobxoBxbobobXooOxxOBXb"
        + "xxXbooxbxooOxoxoobxxBOxxbbbxBxzXxbBxOobBObooofbbBXXOxxoxxbXBbOboxxoo"
        + "BbxOoboXoooXBbBbooOoBbbObxobxbBBoOxoxobBoOXXobObxobxOObobbbxxoboxoXx"
        + "bXoxxxxbbobbXoXooBXXxboxbobxxxXboxOoOoxBoboOXboBoobXobxXdxObbbBxbxBb"
        + "OOXbxooXboxboonxxxXOBbbXXoobooxbbxboxoOxBBbxBOxoobXbbxxbXXObxBbxBXBx"
        + "oxOxoBbxBobOXbboxooBxbooXbXbooBbbxXboxXbxXoxbboxOXOooXbobooXXoxobbxo"
        + "OxOoBbxxoBboboxoOBBxoboBoOboxbbxxbbbObXbboXbObOjXOXBxbxXobbbboBxBoOo"
        + "oxbxxOooxxbxxobbobxbbXoOobbBXoObxobXxoobxBxBbxoobXxoxObboxobobooxOoo"
        + "oBBbbbxxXoxbXxoXooxOBxboobxooxXOxobXoXmObxxXObooXXXboOXxbXxObxxbbObO"
        + "bxbxxbxxBXxBxoxOooaxooxXBXoXOxoOXxbBoBXxXooboXboOooxoxOxXxbxoboOObbB"
        + "oXxbboxxooBBbooxXBbBoxBOobbboobobooxoxOxoXOXXboxXOboBxoboOooxbxBxobo"
        + "oXOoxOOObbxbobxxoxbOBoBxboxoobbbxoooxBxoobBbobBbooOBbxoboooookxXoobb"
        + "bbBbOoxOBOobXObXBxoXoboxobbXBXBBoxBxoxooOxobxo";
    b = "XBOBBOBOXOXBOXOOBOXOXOBBXOXBXOXXBBOBXOXXXOBBXBOOOXXOXBBBXOXOOOXXOBBOXX"
        + "OBBXXXOXXXOXXOOXOXBOBBBXBBXOOXOBXXOOOOBXBOXXBXBXXXBXOBBOBBXXOXXBOBBX"
        + "OXXBBOOOBBBOXBBBOXXBXXOBOBXOOOXXXXXXOBXXBOXXOOOOBOOOXBBOOBXOXXOBBBBO"
        + "OXXOOXXXOBBXXOXBBOXOXBBBOXOBXXXBXXOBBXBOOBBBOXBBBOXBXBOBBXXXOXBOOXOO"
        + "XBOXXOOOOBBBBOOBBOBOOBOBXBBOXBOBOXOXBXOBBOBBOXBOOXXBBBBBXOBXOBXXXBBB"
        + "XOOBOOOXOOBBBXXOXXOXOBOXOBXXOXOOXXXOXXOBOOXBBXBOXBXXOXOXBOBXXOOXOOOX"
        + "XBOOBBXXXBBOXBBXBOBBOOBOOXOXXBXOBOOOXBOXOOXOOOBBOBBOOOBBBBBOOBOXBBBO"
        + "BOBXOXBXOBXBXBXBBBXOOO";
    assertEquals("Sample 12.2", false, ab.abbreviation(a, b));

    a = "laalsAsaasLbbabLslalBbssaAsAlSLsbBllsSalblsssbsaaaAsabBaaAaalsssasssss"
        + "LbasbbllbbLSsslbabAbSlllsbsbbalbBaSaaalbslaabAAaaabsabSlsassSshBBllb"
        + "AAllsSbaLblabsaLBasBsAlLaabBbAllbaslsllsaAaAabbSallbLalsslbbblbasBAs"
        + "baBLalbBssbbAlbbbsSlsllbaLBLaaLblalBSbsBbSsbbaaSlllsblbsSaaBbassslaa"
        + "lblBbslLlaASASbbabbLlbalSabbBbLsbaabbalsAAbSbBbABbabbabaallBsasllbsb"
        + "bsslSsbBlBlbabaalblaLsllbasasalabllSsbslLbsllbLsBlaSbssSAbsSasbsSals"
        + "abbllbbaBSBlabsBlAsbaSLbSllbsAblllSLaaAlBssSsBSLslAAlsbslbalsbSbsbal"
        + "bsBabSbbsssaaabassalslllbsSLSsaLlbbBslSlSbbslsbslSLbbSbAaaaalLlSlAsl"
        + "sbmslbbalblLabSslassBabllSAsbbsvLllSalalbsaaaLAaSSbLbblaaSbLaalABlab"
        + "sAsBsalssbBLlsLssaabsslabpSbsBaBbbSBlsaaabbblslBAblsLaASlaAlbaaSssbb"
        + "lalAaasbaalbLlaabbAaaaaAalsabbsllaaAsallsasBbAaslbbsbllbbllbslaBASbb"
        + "SblaAbbsbbssAaBbsasLllalBlslssasbssBALAasbbsbSfasabbllbAslbalbaSSlsl"
        + "bbSbsaBsAalablAbbaBBsbsSbdaAsBblsblbABbLAssAbalsbssSssbBBssAsABLssbl"
        + "sLbllSblasllLbBsassllBbBbsbBsbllsBBsAbbLLlAslBlsAAASlaalabasaLslasBL"
        + "lsslsaaslsbblbAsalSlllsLSAaLlalAalsBsaslaaaalb";
    b = "ALASALABLABBASASLSBLSSLSSASBBAASSSLBBLLSSBAASLBBASBSLAAASSSSSBBLAALSAL"
        + "LBASBALLBBABASLLSAAAASLBBABABLABBALBSALBLLLBSSBSSAASSBBALALBBBSLLLAS"
        + "ASLASABBBLASAASBBABAAALBLLBSSBBLBLBLLLAALLLSSSLLSLLBSSSABSSSSSBABSBL"
        + "ASBASSLBSLSASLAALBSBSLAASBSSBBSBBSSLLBSLSSLLBBLSLSSLBBSAALSASLSLBSAB"
        + "ALSASLLLSLLAASSLBASBLAAABBABSBLLASASSBABBSBBBBLBABSLAASAASSSBLALAAAS"
        + "BLLBBAAABBLAABASSBBBLBLABASBSLAABBBSAABBASLLBSSSBBALASBSSBBASSLSBABA"
        + "BBBSSAABBLBABLAAABSBBSAABLSSSLSLLBALBBBBBSBBSABLLABLSAAASLABAALSABLS"
        + "LBLBASASLLSALAABAAAALB";
    assertEquals("Sample 12.3", true, ab.abbreviation(a, b));

    a = "EerRrrreeReeeErEEEEeRErerrrreeeerreerRrrEeeeReerrrrErereeRRRrREReERrEerREeEsrrrREeErererrRreERrrErreeeEEeReRrerrrERrreeerrrreEerrerreRerrRerRererrereeeerrrrReRRRrRreerrererReRererRrRRerRRreRRrRrrrEeRrrEEeeEeerErrereErEerreeeREererrRRERrerrrrreEerRrrrEeRERreereeereErerrrrrererErerErREEereReeeEeerRrerrrrrrreerErreEReeererrreeeeeeeEereErreerEerrerERrrereeEeREeRerErErreRrrrRrreEERrrRErrRreeEeEeeeerreRerRreEReeEeRERRreReEeerEErrrERreeErerEeERrRrrReerrreeeEerrerrrerrrrreeerreEerReRRErEerreerReeeeerrRrrrrrreerRreeEEereeeeErrrrrererErREeRrrReerrErEeEeerRreeeeeRrERerRrrererreReerereeerreRreeereERrrErreeeeerrrrrEReErrRerrErereEeerrrerrEerreEeererRererReeeErEereeRrrerreEeRrrRrrErrEereRreeereErRerereeeeRrRrreeerrrereereeERrRrrrRRrrRReerEEEReerRrererREereerRrrerrEeeererRrERreEreRrrRreerReRerreereRRreeERrEeEreErEreERrerEerrereEeerereerrEREeeEerserrrrreeRrRerrrERreEersEReREEerRrerrrReErrRerreReerererrrRErrsEErrErEEerrEREreeErrrEereRrrErRereeerREeEeEeerrrererrrRrRrEreERrrrerEerrrRRrerreereeRereerreeee";
    b = "ERREREEEEEEREERREEERERRERRRERERRRRREREEREERREEERRREERERERRERREEERRRERRRRERRERRRRREERRRRRRRRRRRRERRRRRRERRRREERREEEEEREERERREEERRRERERERRERERRERRREEERREEEEREEEERRRREERERREREEEEEEEREREEEEREEREREEERRRREERREREEEEERREREERERRREEEEERREREEREEERRRRERERRRRREERERRRERERRRRERRREEREERRERERRREREERREERERRRREREREERRERERERERERRREEEEERREREERERRERREREERRREEERRREREREERERREEEERRRRRRREEERERREEEREERREREERRRRRRERRERREEREEREEERRREREEREREREEERERRERERERSERREERREREERRERREREREEREREEEREEREERERREREEEREEEERRERRREERRERERRREEEREE";
    assertEquals("Sample 12.4", true, ab.abbreviation(a, b));

    a = "YYRlYyrYYrLYYyrllRLzrLLRrRylyylrRRyYYLLYllyyLllyLrLrYlrryRsYYYYYlyRrrrRlRRrLlyrlLLLRYlrrrrrlrrylYRRLlllRyyYRlyyLYryrRyyryLiLylyryyrlRLLLrlLRLYrylYrLylyyRrLyyylYlLrrylYyrLLrwyRRylLRrllYRrrrYlLyyRLrLRlLLlLYLYYYlRyyYYRyrllrrlllyrLrlllLrylRRrLLrRRlyrrRRYyYlllyLrRLlRlrRrYyLLjyRLlLYyryYyrylrlrLyylRyryrLLyLYLyLYrYlLYrRRrlYlyrryRYllLLLyRrRRylLyYlYyRLRLlyRRlrrRRrlRlRlryRRyRYRrryYYYlYYrLlllYrlRRlryyllYyRlYyRLrRrLYYyLrrYllYRyLlylLlrlRlLlryLryRlYylRLYlLYrlyRrrrllYlYLLYRRrRRLLYLlYllYlyrLRylRYlLyLRLrRYLyRlmLLlYlLrRlLylLlrLYyyYYYrRlrrylyRylryrLryrlYrlLrYlyryryRLyLlYRlYyrYRyylryYRryyylRylryRRyllrlllYrYRrrlYyRRyrYlYpylRrRYRLyRRRrrrYRLylrlRyyRlylYLYYRYlryLlRLYyRLLYyllRlRlRlyylRYRlLlYlyRlYrYRYLyYRyRLrRYrYrLYyYYlRryrrlylYyrlRrryYllnRLyYlYryrRLlYyLryylYyRRYLrLlyrYlRLlRLryrylLLRLrlYYyLrLyrYLyLrYlYYrYYlrLrllYlllYYlrlRyYRyLRRRrLrlLyRLRRLrLRrLyLRYRLYyRLLyRRlRLllyrYlRllrLlLyLrLYlryYYlLyLlRRRrfyLLrlRlyYRLrYyYyYylyyyryllYLRRrLrylYlyRyYLlnrYrLyRRRyRYYYrYrRlyLryyrrrlygrrRRyRYRyrRRllRlrYlRylryLryylrryYlYlyrllLllyYYY";
    b = "YYRYYYLYYRLLLRRLRRYYLLYLLLLYYRYYYYYLRRRRLLLLRYRYRRLLRYRYLYRLLLRRLLLLRLYYLRLYLYLLRRLRLYRYLRLLRLLLLYLYYYRYYRLLRRLLRRLRRYYLLRLRLRYLLRLLYRYLRLLLYLLYYLYRRYRYLLLRRRLYYRLRLYRRRRRRYRRRYRRYYYYYLYRRRYRYYRLRLYYLRYYRLLLRLLRYYRLYLYRRRYYLLYRRRRLLYLLYYYLRRYLLRLRYLRLLYLRLLLYYYYRRRLYLLYRLLYRYYRYRRLRRLYYRYYRRRYYLRRYRLRRRYRLRRYLYYRYLRLRLYRLLYRRRRYRLLYLRYYRYLYRRLRRYYLYYYLRYYRYYRLYYRRLYLYRRYLLYRLRLLLRLYYLRLYLLYYYYYLLYYYRYRLRRRLLRLRRLLRLLRYRLYRLLRRRLYRYRLLLLYYYLLLRRRLLRYRLYYYYLRRLYRYLLYLRRRRYYYYRRLRRRRYRRRRRYRLYYLYYY";
    assertEquals("Sample 12.5", true, ab.abbreviation(a, b));

    a = "vvvkeevekVVvvkkKeeVvKvkevkvvkevevkeveekkkvekVkeEevVvkkKevekkkkekkekvevkevekkevEvEkEvvKkkveveKkKkkEekevkveKvkKkVeeEeeeekkekekvvkkvkeKvkKvkeKkKKEvvVekeKeKvvkeKvveeEEvkeveekVvekkkkevkkkkekVvvvkkEekkvkekVKvekVevvKkvvEveeekkEvevkekeveVkKevkVkeEvkeeEkkvekeevVvvvvkkvveKeevkkevvVekvKEEVvkvVkeVkEkkvvEekVkekevvVEEvvkKkkevEeVKvEekkVkVvkkevkvVeEeeeEvvkkkeVkeeVekEkeevkvVkKeevkKvkekvVevvvVkvKKKevekEvVekvEVeKkKKkvvevekvevkKvvvVvEEkEeveekKKVEKkkVKvKevkveVvVveeKVekEkkevvveveKeevkVvvEVeEkEkKkkeeeveeekekKeVvekevEKvkkkkVkEkekeEEekvkVVkekvKKkeeEvkeVkkekkvvKvKvEEVvvvVekkeeekEvvKvvvvVVEeeKVKvVekeekvvekvvekEeKekeEeVVEeeKEeEEvvveEevVEVkEvkeEkeveeeeevkkeVkVKvvvekeveKekeekvevkveEkKkkevEkKkvveKkkkvvEEvKKeVekVVkveeekEvkkvKvkvveEvKkvEvvveKKekevEeekKekkkkvKkkEvKkeEkvKvkevekVKVKvveKvkvvkkVvkvKEKvvvvkeekevkEVvKeKkkevVkkEEkkvkveVVvevevekkkeEevEkeVkeKkVekvEevkeeEvVKVeeVkVekkvevekEeKevvvkeevvvVevKvVevVvVkkevEeVkEvEvevEeevKkkevekkvEkvkvKkeveveekvveKvKeeeeekEkEkKeKkkkvkEkekvEekeekkvvvekveekeeveKekeVevEVekkKKKvkekkkEvkeekke";
    b = "VVVKEEVEKVVKKEEVVKEVKVVKEVEVKEVEEKKKVEKKEEVVKKEVEKKKKEKKEKVEVKEVEKKEVVKVVKKVEVEKKKEKEVKVEVKKEEEEEEKKEKEKVVKKVKEVKVKEKVVEKEEVVKEVVEEVKEVEEKVEKKKKEVKKKKEKVVVKKEKKVKEKVEKEVVKVVVEEEKKVEVKEKEVEKEVKKEVKEEKKVEKEEVVVVVKKVVEEEVKKEVVEKVVKVKEKKKVVEKKEKEVVVVKKKEVEVEKKKVKKEVKVEEEEVVKKKEKEEEKKEEVKVKEEVKVKEKVEVVVKVEVEKVEKVEKKVVEVEKVEVKVVVVKEVEEKKKVEVKVEVVEEEKKKEVVVEVEEEVKVVEKKKKEEEVEEEKEKEVEKEVVKKKKKKEKEEKVKKEKVKEEVKEKKEKKVVVVVVVEKKEEEKVVVVVVEEVEKEEKVVEKVVEKEEKEEEEEVVVEEVKVKEKEVEEEEEVKKEKVVVEKEVEEKEEKVEVKVEKKKEVKKVVEKKKVVVEEKKVEEEKVKKVVKVVEVKVVVVEEKEVEEKEKKKKVKKVKEKVVKEVEKVVEVKVVKKVKVVVVVKEEKEVKVEKKEVKKKKVKVEVEVEVEKKKEEVKEKEKEKVEVKEEVEEKEKKVEVEKEEVVVKEEVVVEVVEVVKKEVEKVVEVEEVKKEVEKKVKVKVKEVEVEEKVVEVEEEEEKKKEKKKVKKEKVEKEEKKVVVEKVEEKEEVEEKEEVEKKVKEKKKVKEEKKE";
    assertEquals("Sample 12.6", false, ab.abbreviation(a, b));

    a = "RreeerrEeRReReErrrReerresrERrrrReTrreEerRRerRrereeSeeererEeEeeErEREErrErrreeeerRerrrrRerEREeererSeRrReRerrrerrErEReeerrrrrReEreerReerRerREERreeeeRreReeeeeEErRRrrererreRreReeereRrerreRrREEeReEErrrreeErEeReRrrerrrEreereereeRrEeRrreREeeerEReREerrrrreerErEErrrrRErrrRrreeReReereERerereReRreEeeeeEEeerrrerRrrrrRerreeeEEereeereeEeeEseeReEreRRERrrrereerrererrEReerrrrrreeeRrreeeeeRRrsrrREererERRreereeRereEeRrRrRereEeeeRreEeerrRrereRerrrerererErRererrreeEeRRrErErrErrerrrreerrrreReeererersreReerEreRerReRRreEeeReereeEerrEEErrrEererreeerreeerrrrrEeeEEerrrReReeerreeREeEeREeReeeeREeRerERerreRereeslrrreeerERerErrRreRRrreEeererrrRRRreErrRREreeEeereeerrreeerrEerrrRRrerrerRReErRRrreEeeRereeEeERreEeEerREErReReRerrrreeERErereRreeReeeeeeErrreeerEeerEREeeReereerrrrerrErerrErerRrrErerrReEEerReeERRRrErereeeerERerRrRErSeEeeeeRrEereeeErrrREerERerReeeeReerRrreeEEeEerrereeeererEEERseeererRrrRerreersereeeRrreeEerrrrrreRERrErerrreRrrererRerererRreErEErrRrREreRrRrerReEeRrErrerererrreerreEReeRererrreReEEererREeEvRRrrer";
    b = "REEERRRERERERRRRETRERRRRRERESEEEEEEEREREEEERRRRRERERSRRRERRREEREERRREERREEREREEEERRRRRRREREEEREERRRREERRERRREEERRERREEEEERRRRERRRREEERRRREEEEEEERRRRREEEEEEEEEEESRERRERRRRRERRRERRRRRREREREEREERRRREREEREERRRERERRREERREERERRERRRESERERRRERREREEEEEEREERERREEREEEERREREEEREEERERRERRERREEEEERERRRRREERRRREERRRREEERERREEERRRRRERRREREEEREEEREERREREREEREEREEEERREEREEEREREEREERERRERRERRREEEERREERRREREERERRRERSEEEEREERERREERERERREEEREEREEERSERRREREEERREERRRRERERREERERERREEREERRRERRREEREEEREEREERERREEEEREEERRR";
    assertEquals("Sample 12.7", false, ab.abbreviation(a, b));

    a = "ANzaNanaanAZnnaazzzNAznnZaaZzzaZzzznaaaaZAANnaaanZnzazaAANanZaznazznzaAaNznazzanaZznzANzznzaaZzAnanNanzzAazzZZananazAznaznNznaAAaZnnanzazANAANAnnnzazaaaanzaznAaaNZnNAnnanazaZzNzazanZnazaAzanazzaNznNzzzaaanZaAnNAanzznNaNznanAnananNnaazznznnzNznnNzzanzAaNzzzZzAnnznaanzZznzNZzZzznnnaazzzanaazzazznnanANnznzAZzNZnNnanzazNaZZzzazAnNzAzAZAazanzzZzaznnZzaaazzznnaanaazaAnzzzZaaazzzzNaaNazzaaANznazAannzAaZZaznnzznnAzaaaanaaAznazZAnzzaAzaZzzZzznzazAznnaznznnaNAazZzzazNazanzaanZaZznnznzaNzannnZZNnaznzaNaAZznazAzAzNnnanznannaznAznnnnazzNnaazAanzZnaAnnaAzaanZnZNNzannanznazAnzNanaZznAAnnnNzaznAnZZnznaanzzaNzzAZzaNzNzaZanaNzNnnnAnaaZnaaznanZnzaannanzAzazazaNannaaznNnNnzaazazAzAnAzzaNaaNnanzaaZANaaZnaAzazaZZZAznAaaZnaAnnAanaAAnznNNzNnanZzzZzzNzaZaaznnznzNnaNZannNzAnnnznAazaaaanZzzananznzzZznNNzzznnznannZzznzzaZazaNnnnZzanznazzazzanzazzZannzAzazAZnnzNZannzZaNznAZanaaanAnNzzznzZaanANZananzzZaNzzaZnnzazZanzznAaaAZZaznANNzanaaanNzAnaanaAzzZnNannznaNznANzznzZanaNNaZnzaznzZaanzznnnAANzzZananzNZnaaZaANZzNAAaz";
    b = "ZAANAANNNAAZZZZNNAAZZAZZZNAAAANAAANNZAZAANAZNAZZNZAAZNAZZANAZNZZZNZAAZNANANZZAZZANANAZZNAZNZNAANNANZAZNNNZAZAAAANZAZNAANNNANAZAZZAZANNAZAZANAZZAZNZZZAAANANANZZNAZNANNANANNAAZZNZNNZZNNZZANZAZZZZNNZNAANZZNZZZZNNNAAZZZANAAZZAZZNNANNZNZZNNANZAZAZZAZNZZAZANZZZAZNNZAAAZZZNNAANAAZANZZZAAAZZZZAAAZZAAZNAZANNZAAZNNZZNNZAAAANAAZNAZNZZAZAZZZZNZAZZNNAZNZNNAAZZZAZAZANZAANAZNNZNZAZANNNNAZNZAAZNAZZZNNANZNANNAZNZNNNNAZZNAAZANZNANNAZAANNZANNANZNAZNZANAZNNNNZAZNNNZNAANZZAZZZAZZAANAZNNNNAANAAZNANNZAANNANZZAZAZAANNAAZNNNZAAZAZZNZZAAANANZAAAANAZAZAZNAANANNANANZNZNANZZZZZAAAZNNZNZNAANNZNNNZNAZAAAANZZANANZNZZZNZZZNNZNANNZZNZZAAZANNNZANZNAZZAZZANZAZZANNZZAZNNZANNZAZNANAAANNZZZNZAANANANZZAZZANNZAZANZZNAAAZNZANAAANZNAANAZZNANNZNAZNZZNZANAANZAZNZAANZZNNNZZANANZNAAAZAZ";
    // assertEquals("Sample 12.8", false, ab.abbreviation(a, b));

    a = "evivevvVvevvEeeevVevevVvevEVevEeeEVVveevEvevevEeEeEEeeVevvvVVvevveevev"
        + "EeVeVvvveeeeeivVveEevvEeveevvevvvVeevVeeeeveebveeVvvvvvEVEvEvvvvEEVV"
        + "eeeVvEVEvevvevEvveVeEeeeVveVEVvvvvEeeVVvVeEEVvEEeeeveveeevVVeeeevVve"
        + "eVvevVVevevvEEveVEEVVeeeEeveevevEvvvvevveeeeVEvevvEVvvvVevevvvveVeev"
        + "VveevVeEevEEeeevVeieeeVvvvevvVeevvveeeevvVevEeevvvevveveevvveeeveeev"
        + "VivevvevVvVeeevvEveevEEVeeVVEeeeevvveeEeveevvVeeEeevvvveeVvveveeeEve"
        + "eeEeveeveVeVEveevvvVeevvveeEevVveeeVEeevEveevvVeveeeeVVVVeVEvvEVveve"
        + "EvVeeeeEeeevvVEvveevvEeevevvVEeeeEvvvevvVvEVEvvvvvVvevEvVvVeevVevvVv"
        + "EvveeeeeeEeveeVvEvVVvveveEvvVveeevvvViEeEEveeevvVevEveVVVeEeevVeveeE"
        + "eeeeeveEvvVEeeEeveEvvvvveeVveVeVveeeVveEveeVvEVeEEeveeeVvvveEeveveee"
        + "VevevvveveVEEeveveevevveeevVeeeveveeveeveevvvEeeEvVeveevVEVEvvVVeeve"
        + "VevViEEvVevevvVVEVVvvVeiEvVeevevvvEevvEvvvvevVveeVvvEevEeEEvEeeeeevv"
        + "eveevveveeeeVVeeveevvvveeVEEEveeeveeeEveeVVeeeVvEvvevveevvveVveeievi"
        + "vvVvvevevveeEeVEEeveveeVEEveviEveeivVvvVIEeEEvEveevEEveVvvEEveVeVEVv"
        + "veveeVvVeEveeVVvveveeveVeveevvevEeVeeveVeEeVve";
    b = "VEVVEEVEVVEVEEVVVEVEEEEEEEVVVEVEVEVVEEVEEEVVVEEVEEVVVEVEEVEEVVVVEVEVEV"
        + "VEEVEEEEVEVVEEEVVVEEEVEEEVVEEVVVVVVEVVVVVEEVEEVVEEEVEVVVVEVEVEVEVVVE"
        + "VVEEVVVEEEEEEVVIEEVVVVEEVVVEVEVVVEVVVEVIVEVVVVEEEEEVVVEVEEEVEVEEVEVV"
        + "VEVVVEEEEEEVEVEVEVVEVVVVVEVEVEVEEEEVVEVEEEEVVEEEEEVEVEVEVVVEEVVEVVVV"
        + "EEEEEVEVVVVVEEEVEEVEEEEVEEVVVEEEVEEVEEEEEEEVVVEVVEEVEVEEEVVVVEVEEVEV"
        + "EVVVEEVEVVEVVVEVEEEEVVEVEVVEEVVVEEVVVVEVVVVEVVVVVEVEVVVVEVEEEEEEVVVE"
        + "VVEEVVVEEVEEEEEEEEVVEEVEVEVVEVEIVVEEVEEVVEEVEEEIVVVVIEEEEEVEEEVEEEVV"
        + "EVVEVVEVVEVEVEVEVVVEVE";
    // assertEquals("Sample 12.9", false, ab.abbreviation(a, b));

    a = "cCccCoccocOOCCOccoccoCooCocoOoCcoCoooooOcococccOoocCoccOcoCcoooocCoooo"
        + "cCwcooowcocoocOococoocooOooCCooccooCCocooccoCoococccCccocoOoCcOCoccc"
        + "ocOoOooOOooooccOcococcOOooCccooCoccOccoCcoCccOcccOoCCococCooOCooccco"
        + "coOocoOCCcoccOcOcccoOooooOOOoOcCcocCoCoOCOOcOcOOocooooocoCccocooocoo"
        + "oocccccooccccCCcoocococCcccCOcccccOoooOoooCcocccooocoCccOCCCccooccOw"
        + "cCoccCcCcccocooOocCocccoOccocooccOocccooocooccOcccocoocoOOCOocOoococ"
        + "ooOoOcocoocOcCcococcocCcoCoCOoOcoOOccoCcOoococoCooocccCooccCCcccCOoo"
        + "ocoCOoOCcCccccocwcoCCOOcOoOccccCcocoCCococcCooOCcocccocOcocoocooooCo"
        + "ccccooOccCocoOOocococooOcccCocoOoccoCoocOccOoOOooooooocCoocCCcccococ"
        + "oooocCcoOooooOCcOccCooooOoocccccocoOocoCccCCcwOoOcocoocoOocccoOoCcco"
        + "coocccccccooowccccOcCCoocooocOooococOOoooccoOwooOCccccoooocCoooooooo"
        + "ooCwcooCcccoOcCoooOoOcwOoCoCcCocwoOOCcoocOOcCooocOoOooOoOccOcccocCoO"
        + "cOcocoococcOoooccccccCoCooCcoooocCccOCccCooCcoOCcocoocOcoocoooOocCcC"
        + "coocoCOoOoocooCococoOccCoCoooocOoooOcoooCccocoocococOcOCccccoocccccc"
        + "cCooOoowoOcooOcCCOoCccCocooccoccoCCoccocOcccCo";
    b = "CCCOOCCOCOCOCOOCCCOOCOCOCOCOCCCOOCOOCOOWCOOOOOOOOOOCCOOCCCCCOCOCOOCOCO"
        + "OOOOOOOOOOCCOCOOCCCCCOCOOCCCCOCOCCOOOOCCCOCOOCOOOOOOOCCCCOOCOOCOOOOO"
        + "OCCOOOOCCCCCCCCOCCCCOOOOOCOCOCCOCCCCOCOCCCCCCCOOCCOCCOCCOOOCOOOOCOOO"
        + "OOOCCOOCCOOCOCCCCOOOOOOOCOCOCCCCCCOOOCCOOCCCCCCOOCOOCCCCCOOCCCOCCCOC"
        + "OOCOCCOCCOOOOOOOOOCCOOOCCOCOOOOOOOOCCCCOCOOCCOOOCOCCOOOOCOOOCCCWOOOC"
        + "COOCCOCCOCCOOCOCCCOCOOOOOCOOOCCCCCOCOCOOCOOWOOCCCOOOCCOOOCCOOCOOOOOO"
        + "COCCCOOCCCOOCOCOCOCCCCOCCCCOCCOOOOOCCOCCOOOOCOOCCCOOOCOOOOCCCOCOCCCO"
        + "CCOOOCCOOCCCOOCCOCOOCC";
    // assertEquals("Sample 12.10", true, ab.abbreviation(a, b));
  }

}
