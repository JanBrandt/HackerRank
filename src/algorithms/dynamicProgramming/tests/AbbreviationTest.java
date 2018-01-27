package algorithms.dynamicProgramming.tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import algorithms.dynamicProgramming.Abbreviation;

/**
 * @author Jan Brandt
 * @version 0.9 27/01/2018 Contains tests for the Abbreviation-Problem from
 *          HackerRank
 */
public class AbbreviationTest {

  /** Test-sample from HackerRank. */
  @Test
  public void testAbbreviationSample() {
    String a = "daBcd";
    String b = "ABC";
    assertEquals("Sample", true, Abbreviation.abbreviation(a, b));
  }

  /** Test with a is lowerchar of b. */
  @Test
  public void testAbbreviationOnlyLC() {
    String a = "afz";
    String b = "AFZ";
    assertEquals("Only lowercase", true, Abbreviation.abbreviation(a, b));
  }

  /** Negative test with missing char. */
  @Test
  public void testAbbreviationMissingSingleChar() {
    String a = "afz";
    String b = "AFZC";
    assertEquals("MissingSingleChar", false, Abbreviation.abbreviation(a, b));
  }

  /** Test with alternating letters. */
  @Test
  public void testAbbreviationAlternating() {
    String a = "faDfaBeqZfsDokfZabzUqrzebniAasd";
    String b = "FDFBEZFDFZBUIAS";
    assertEquals("Alternating", true, Abbreviation.abbreviation(a, b));
  }

  /** Test-sample 10 from HackerRank. */
  @Test
  public void testAbbreviationSample10() {
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
    assertEquals("Sample 10.1", true, Abbreviation.abbreviation(a, b));
  }

  /** Test with problem cases occuring during debbuging. */
  @Test
  public void testAbbreviationProblemCases() {
    String a = "aAbB";
    String b = "AB";
    assertEquals("Problem Case 1", true, Abbreviation.abbreviation(a, b));

    a = "ANzaNanaanAZ";
    b = "ZANANAANAA";
    assertEquals("Problem Case 2", false, Abbreviation.abbreviation(a, b));
  }

  /** Test-sample 12 from HackerRank. */
  public void testAbbreviationSample12First() {
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
    assertEquals("Sample 12.1", true, Abbreviation.abbreviation(a, b));

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
    assertEquals("Sample 12.2", false, Abbreviation.abbreviation(a, b));

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
    assertEquals("Sample 12.3", true, Abbreviation.abbreviation(a, b));

    a = "EerRrrreeReeeErEEEEeRErerrrreeeerreerRrrEeeeReerrrrErereeRRRrREReERrEe"
        + "rREeEsrrrREeErererrRreERrrErreeeEEeReRrerrrERrreeerrrreEerrerreRerrR"
        + "erRererrereeeerrrrReRRRrRreerrererReRererRrRRerRRreRRrRrrrEeRrrEEeeE"
        + "eerErrereErEerreeeREererrRRERrerrrrreEerRrrrEeRERreereeereErerrrrrer"
        + "erErerErREEereReeeEeerRrerrrrrrreerErreEReeererrreeeeeeeEereErreerEe"
        + "rrerERrrereeEeREeRerErErreRrrrRrreEERrrRErrRreeEeEeeeerreRerRreEReeE"
        + "eRERRreReEeerEErrrERreeErerEeERrRrrReerrreeeEerrerrrerrrrreeerreEerR"
        + "eRRErEerreerReeeeerrRrrrrrreerRreeEEereeeeErrrrrererErREeRrrReerrErE"
        + "eEeerRreeeeeRrERerRrrererreReerereeerreRreeereERrrErreeeeerrrrrEReEr"
        + "rRerrErereEeerrrerrEerreEeererRererReeeErEereeRrrerreEeRrrRrrErrEere"
        + "RreeereErRerereeeeRrRrreeerrrereereeERrRrrrRRrrRReerEEEReerRrererREe"
        + "reerRrrerrEeeererRrERreEreRrrRreerReRerreereRRreeERrEeEreErEreERrerE"
        + "errereEeerereerrEREeeEerserrrrreeRrRerrrERreEersEReREEerRrerrrReErrR"
        + "erreReerererrrRErrsEErrErEEerrEREreeErrrEereRrrErRereeerREeEeEeerrre"
        + "rerrrRrRrEreERrrrerEerrrRRrerreereeRereerreeee";
    b = "ERREREEEEEEREERREEERERRERRRERERRRRREREEREERREEERRREERERERRERREEERRRERR"
        + "RRERRERRRRREERRRRRRRRRRRRERRRRRRERRRREERREEEEEREERERREEERRRERERERRER"
        + "ERRERRREEERREEEEREEEERRRREERERREREEEEEEEREREEEEREEREREEERRRREERREREE"
        + "EEERREREERERRREEEEERREREEREEERRRRERERRRRREERERRRERERRRRERRREEREERRER"
        + "ERRREREERREERERRRREREREERRERERERERERRREEEEERREREERERRERREREERRREEERR"
        + "REREREERERREEEERRRRRRREEERERREEEREERREREERRRRRRERRERREEREEREEERRRERE"
        + "EREREREEERERRERERERSERREERREREERRERREREREEREREEEREEREERERREREEEREEEE"
        + "RRERRREERRERERRREEEREE";
    assertEquals("Sample 12.4", true, Abbreviation.abbreviation(a, b));

    a = "YYRlYyrYYrLYYyrllRLzrLLRrRylyylrRRyYYLLYllyyLllyLrLrYlrryRsYYYYYlyRrrr"
        + "RlRRrLlyrlLLLRYlrrrrrlrrylYRRLlllRyyYRlyyLYryrRyyryLiLylyryyrlRLLLrl"
        + "LRLYrylYrLylyyRrLyyylYlLrrylYyrLLrwyRRylLRrllYRrrrYlLyyRLrLRlLLlLYLY"
        + "YYlRyyYYRyrllrrlllyrLrlllLrylRRrLLrRRlyrrRRYyYlllyLrRLlRlrRrYyLLjyRL"
        + "lLYyryYyrylrlrLyylRyryrLLyLYLyLYrYlLYrRRrlYlyrryRYllLLLyRrRRylLyYlYy"
        + "RLRLlyRRlrrRRrlRlRlryRRyRYRrryYYYlYYrLlllYrlRRlryyllYyRlYyRLrRrLYYyL"
        + "rrYllYRyLlylLlrlRlLlryLryRlYylRLYlLYrlyRrrrllYlYLLYRRrRRLLYLlYllYlyr"
        + "LRylRYlLyLRLrRYLyRlmLLlYlLrRlLylLlrLYyyYYYrRlrrylyRylryrLryrlYrlLrYl"
        + "yryryRLyLlYRlYyrYRyylryYRryyylRylryRRyllrlllYrYRrrlYyRRyrYlYpylRrRYR"
        + "LyRRRrrrYRLylrlRyyRlylYLYYRYlryLlRLYyRLLYyllRlRlRlyylRYRlLlYlyRlYrYR"
        + "YLyYRyRLrRYrYrLYyYYlRryrrlylYyrlRrryYllnRLyYlYryrRLlYyLryylYyRRYLrLl"
        + "yrYlRLlRLryrylLLRLrlYYyLrLyrYLyLrYlYYrYYlrLrllYlllYYlrlRyYRyLRRRrLrl"
        + "LyRLRRLrLRrLyLRYRLYyRLLyRRlRLllyrYlRllrLlLyLrLYlryYYlLyLlRRRrfyLLrlR"
        + "lyYRLrYyYyYylyyyryllYLRRrLrylYlyRyYLlnrYrLyRRRyRYYYrYrRlyLryyrrrlygr"
        + "rRRyRYRyrRRllRlrYlRylryLryylrryYlYlyrllLllyYYY";
    b = "YYRYYYLYYRLLLRRLRRYYLLYLLLLYYRYYYYYLRRRRLLLLRYRYRRLLRYRYLYRLLLRRLLLLRL"
        + "YYLRLYLYLLRRLRLYRYLRLLRLLLLYLYYYRYYRLLRRLLRRLRRYYLLRLRLRYLLRLLYRYLRL"
        + "LLYLLYYLYRRYRYLLLRRRLYYRLRLYRRRRRRYRRRYRRYYYYYLYRRRYRYYRLRLYYLRYYRLL"
        + "LRLLRYYRLYLYRRRYYLLYRRRRLLYLLYYYLRRYLLRLRYLRLLYLRLLLYYYYRRRLYLLYRLLY"
        + "RYYRYRRLRRLYYRYYRRRYYLRRYRLRRRYRLRRYLYYRYLRLRLYRLLYRRRRYRLLYLRYYRYLY"
        + "RRLRRYYLYYYLRYYRYYRLYYRRLYLYRRYLLYRLRLLLRLYYLRLYLLYYYYYLLYYYRYRLRRRL"
        + "LRLRRLLRLLRYRLYRLLRRRLYRYRLLLLYYYLLLRRRLLRYRLYYYYLRRLYRYLLYLRRRRYYYY"
        + "RRLRRRRYRRRRRYRLYYLYYY";
    assertEquals("Sample 12.5", true, Abbreviation.abbreviation(a, b));

  }

  /** Test-sample 12 from HackerRank. */
  @Test
  public void testAbbreviationSample12Second() {
    String a = "vvvkeevekVVvvkkKeeVvKvkevkvvkevevkeveekkkvekVkeEevVvkkKevekkkke"
        + "kkekvevkevekkevEvEkEvvKkkveveKkKkkEekevkveKvkKkVeeEeeeekkekekvvkkvke"
        + "KvkKvke"
        + "KkKKEvvVekeKeKvvkeKvveeEEvkeveekVvekkkkevkkkkekVvvvkkEekkvkekVKvekVe"
        + "vvKkvvEveeekkEvevkekeveVkKevkVkeEvkeeEkkvekeevVvvvvkkvveKeevkkevvVek"
        + "vKEEVvkvVkeVkEkkvvEekVkekevvVEEvvkKkkevEeVKvEekkVkVvkkevkvVeEeeeEvvk"
        + "kkeVkeeVekEkeevkvVkKeevkKvkekvVevvvVkvKKKevekEvVekvEVeKkKKkvvevekvev"
        + "kKvvvVvEEkEeveekKKVEKkkVKvKevkveVvVveeKVekEkkevvveveKeevkVvvEVeEkEkK"
        + "kkeeeveeekekKeVvekevEKvkkkkVkEkekeEEekvkVVkekvKKkeeEvkeVkkekkvvKvKvE"
        + "EVvvvVekkeeekEvvKvvvvVVEeeKVKvVekeekvvekvvekEeKekeEeVVEeeKEeEEvvveEe"
        + "vVEVkEvkeEkeveeeeevkkeVkVKvvvekeveKekeekvevkveEkKkkevEkKkvveKkkkvvEE"
        + "vKKeVekVVkveeekEvkkvKvkvveEvKkvEvvveKKekevEeekKekkkkvKkkEvKkeEkvKvke"
        + "vekVKVKvveKvkvvkkVvkvKEKvvvvkeekevkEVvKeKkkevVkkEEkkvkveVVvevevekkke"
        + "EevEkeVkeKkVekvEevkeeEvVKVeeVkVekkvevekEeKevvvkeevvvVevKvVevVvVkkevE"
        + "eVkEvEvevEeevKkkevekkvEkvkvKkeveveekvveKvKeeeeekEkEkKeKkkkvkEkekvEek"
        + "eekkvvvekveekeeveKekeVevEVekkKKKvkekkkEvkeekk";
    String b = "VVVKEEVEKVVKKEEVVKEVKVVKEVEVKEVEEKKKVEKKEEVVKKEVEKKKKEKKEKVEVKE"
        + "VEKKEVV"
        + "KVVKKVEVEKKKEKEVKVEVKKEEEEEEKKEKEKVVKKVKEVKVKEKVVEKEEVVKEVVEEVKEVEEK"
        + "VEKKKKEVKKKKEKVVVKKEKKVKEKVEKEVVKVVVEEEKKVEVKEKEVEKEVKKEVKEEKKVEKEEV"
        + "VVVVKKVVEEEVKKEVVEKVVKVKEKKKVVEKKEKEVVVVKKKEVEVEKKKVKKEVKVEEEEVVKKKE"
        + "KEEEKKEEVKVKEEVKVKEKVEVVVKVEVEKVEKVEKKVVEVEKVEVKVVVVKEVEEKKKVEVKVEVV"
        + "EEEKKKEVVVEVEEEVKVVEKKKKEEEVEEEKEKEVEKEVVKKKKKKEKEEKVKKEKVKEEVKEKKEK"
        + "KVVVVVVVEKKEEEKVVVVVVEEVEKEEKVVEKVVEKEEKEEEEEVVVEEVKVKEKEVEEEEEVKKEK"
        + "VVVEKEVEEKEEKVEVKVEKKKEVKKVVEKKKVVVEEKKVEEEKVKKVVKVVEVKVVVVEEKEVEEKE"
        + "KKKKVKKVKEKVVKEVEKVVEVKVVKKVKVVVVVKEEKEVKVEKKEVKKKKVKVEVEVEVEKKKEEVK"
        + "EKEKEKVEVKEEVEEKEKKVEVEKEEVVVKEEVVVEVVEVVKKEVEKVVEVEEVKKEVEKKVKVKVKE"
        + "VEVEEKVVEVEEEEEKKKEKKKVKKEKVEKEEKKVVVEKVEEKEEVEEKEEVEKKVKEKKKVKEEKK";
    assertEquals("Sample 12.6", false, Abbreviation.abbreviation(a, b));

    a = "RreeerrEeRReReErrrReerresrERrrrReTrreEerRRerRrereeSeeererEeEeeErEREErr"
        + "ErrreeeerRerrrrRerEREeererSeRrReRerrrerrErEReeerrrrrReEreerReerRerRE"
        + "ERreeeeRreReeeeeEErRRrrererreRreReeereRrerreRrREEeReEErrrreeErEeReRr"
        + "rerrrEreereereeRrEeRrreREeeerEReREerrrrreerErEErrrrRErrrRrreeReReere"
        + "ERerereReRreEeeeeEEeerrrerRrrrrRerreeeEEereeereeEeeEseeReEreRRERrrre"
        + "reerrererrEReerrrrrreeeRrreeeeeRRrsrrREererERRreereeRereEeRrRrRereEe"
        + "eeRreEeerrRrereRerrrerererErRererrreeEeRRrErErrErrerrrreerrrreReeere"
        + "rersreReerEreRerReRRreEeeReereeEerrEEErrrEererreeerreeerrrrrEeeEEerr"
        + "rReReeerreeREeEeREeReeeeREeRerERerreRereeslrrreeerERerErrRreRRrreEee"
        + "rerrrRRRreErrRREreeEeereeerrreeerrEerrrRRrerrerRReErRRrreEeeRereeEeE"
        + "RreEeEerREErReReRerrrreeERErereRreeReeeeeeErrreeerEeerEREeeReereerrr"
        + "rerrErerrErerRrrErerrReEEerReeERRRrErereeeerERerRrRErSeEeeeeRrEereee"
        + "ErrrREerERerReeeeReerRrreeEEeEerrereeeererEEERseeererRrrRerreerseree"
        + "eRrreeEerrrrrreRERrErerrreRrrererRerererRreErEErrRrREreRrRrerReEeRrE"
        + "rrerererrreerreEReeRererrreReEEererREeEvRRrrer";
    b = "REEERRRERERERRRRETRERRRRRERESEEEEEEEREREEEERRRRRERERSRRRERRREEREERRREE"
        + "RREEREREEEERRRRRRREREEEREERRRREERRERRREEERRERREEEEERRRRERRRREEERRRRE"
        + "EEEEEERRRRREEEEEEEEEEESRERRERRRRRERRRERRRRRREREREEREERRRREREEREERRRE"
        + "RERRREERREERERRERRRESERERRRERREREEEEEEREERERREEREEEERREREEEREEERERRE"
        + "RRERREEEEERERRRRREERRRREERRRREEERERREEERRRRRERRREREEEREEEREERREREREE"
        + "REEREEEERREEREEEREREEREERERRERRERRREEEERREERRREREERERRRERSEEEEREERER"
        + "REERERERREEEREEREEERSERRREREEERREERRRRERERREERERERREEREERRRERRREEREE"
        + "EREEREERERREEEEREEERRR";
    assertEquals("Sample 12.7", false, Abbreviation.abbreviation(a, b));

    a = "ANzaNanaanAZnnaazzzNAznnZaaZzzaZzzznaaaaZAANnaaanZnzazaAANanZaznazznza"
        + "AaNznazzanaZznzANzznzaaZzAnanNanzzAazzZZananazAznaznNznaAAaZnnanzazA"
        + "NAANAnnnzazaaaanzaznAaaNZnNAnnanazaZzNzazanZnazaAzanazzaNznNzzzaaanZ"
        + "aAnNAanzznNaNznanAnananNnaazznznnzNznnNzzanzAaNzzzZzAnnznaanzZznzNZz"
        + "ZzznnnaazzzanaazzazznnanANnznzAZzNZnNnanzazNaZZzzazAnNzAzAZAazanzzZz"
        + "aznnZzaaazzznnaanaazaAnzzzZaaazzzzNaaNazzaaANznazAannzAaZZaznnzznnAz"
        + "aaaanaaAznazZAnzzaAzaZzzZzznzazAznnaznznnaNAazZzzazNazanzaanZaZznnzn"
        + "zaNzannnZZNnaznzaNaAZznazAzAzNnnanznannaznAznnnnazzNnaazAanzZnaAnnaA"
        + "zaanZnZNNzannanznazAnzNanaZznAAnnnNzaznAnZZnznaanzzaNzzAZzaNzNzaZana"
        + "NzNnnnAnaaZnaaznanZnzaannanzAzazazaNannaaznNnNnzaazazAzAnAzzaNaaNnan"
        + "zaaZANaaZnaAzazaZZZAznAaaZnaAnnAanaAAnznNNzNnanZzzZzzNzaZaaznnznzNna"
        + "NZannNzAnnnznAazaaaanZzzananznzzZznNNzzznnznannZzznzzaZazaNnnnZzanzn"
        + "azzazzanzazzZannzAzazAZnnzNZannzZaNznAZanaaanAnNzzznzZaanANZananzzZa"
        + "NzzaZnnzazZanzznAaaAZZaznANNzanaaanNzAnaanaAzzZnNannznaNznANzznzZana"
        + "NNaZnzaznzZaanzznnnAANzzZananzNZnaaZaANZzNAAaz";
    b = "ZAANAANNNAAZZZZNNAAZZAZZZNAAAANAAANNZAZAANAZNAZZNZAAZNAZZANAZNZZZNZAAZ"
        + "NANANZZAZZANANAZZNAZNZNAANNANZAZNNNZAZAAAANZAZNAANNNANAZAZZAZANNAZAZ"
        + "ANAZZAZNZZZAAANANANZZNAZNANNANANNAAZZNZNNZZNNZZANZAZZZZNNZNAANZZNZZZ"
        + "ZNNNAAZZZANAAZZAZZNNANNZNZZNNANZAZAZZAZNZZAZANZZZAZNNZAAAZZZNNAANAAZ"
        + "ANZZZAAAZZZZAAAZZAAZNAZANNZAAZNNZZNNZAAAANAAZNAZNZZAZAZZZZNZAZZNNAZN"
        + "ZNNAAZZZAZAZANZAANAZNNZNZAZANNNNAZNZAAZNAZZZNNANZNANNAZNZNNNNAZZNAAZ"
        + "ANZNANNAZAANNZANNANZNAZNZANAZNNNNZAZNNNZNAANZZAZZZAZZAANAZNNNNAANAAZ"
        + "NANNZAANNANZZAZAZAANNAAZNNNZAAZAZZNZZAAANANZAAAANAZAZAZNAANANNANANZN"
        + "ZNANZZZZZAAAZNNZNZNAANNZNNNZNAZAAAANZZANANZNZZZNZZZNNZNANNZZNZZAAZAN"
        + "NNZANZNAZZAZZANZAZZANNZZAZNNZANNZAZNANAAANNZZZNZAANANANZZAZZANNZAZAN"
        + "ZZNAAAZNZANAAANZNAANAZZNANNZNAZNZZNZANAANZAZNZAANZZNNNZZANANZNAAAZA";
    assertEquals("Sample 12.8", false, Abbreviation.abbreviation(a, b));

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
    assertEquals("Sample 12.9", false, Abbreviation.abbreviation(a, b));

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
    assertEquals("Sample 12.10", true, Abbreviation.abbreviation(a, b));
  }

}
