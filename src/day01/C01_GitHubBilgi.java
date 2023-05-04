package day01;

public class C01_GitHubBilgi {


    /*
    git.init komutu, bir workingDirectory'u git ile irtibatlandirir
             bu komut her proje icin sadece 1 kere calistirilir
             bu komut ile birlikte git icinde bulunulan klasoru kontrol etmeye baslar
    Bu klasorde her yedek almak istedigimizde
    commit yapmaliyiz.
    asagidaki 3 komut bizim dosyalarimizi her yedeklemek istedigimizde kullanilir
    1- git add .  : son kaydedilen versiyondan sonra
                    projede yapilan degisiklikleri belirler
    2- git commit -m "commit ismi" :
                    projenin son durumunu bir versiyon olarak kaydeder
                    burada "" icinde yazilan commit isminin
                    anlamli olmasinda fayda vardir.
                    ilerleyen asamalarda geri donus yapmak istersek
                    hangi commit'e donmek isteyecegimizi
                    aciklamalardan bulabiliriz
      git ile ilisiklendirsdigimiz dosyadaki class isimleri
      git durumuna gore renklenir
      kirmizi   : bu class herhangi bir versiyona eklenmedi
      mavi      : bu dosya bir versiyona eklendi
                  ama sonradan degisiklik yapilmis
      siyah     : bu class bir versiyonda son haliyle yedeklendi
                  sonrasinda hic bir degisiklik yok
     3- git push : local repo'da commit ettigimiz dosyalarimizi
                    uzak masaustu(GitHub)ne yollamak icin kullanilir.
                    Local bilgisayarda olusturdugumuz bir repo'yu
                    GitHub'a yollamak ve orada yedeklemek istiyorsak
                    oncelikle GitHub hesabi olusturmamiz
                    ve sonrasinda projemizi gonderecegimiz GitHub repo'sunu hazirlamamiz gerekir
                    Github'da yeni bir repository olusturdugumuzda
                    ilk kullanimda, local repo ile remote repo arasinda
                    baglanti kurmamiz gerekir

           1- dersTekrari klasoru icin once local'de git repo olusturalim
    - once terminal/cmd'de derstekrari klasorune gidelim
      users/ahmetbulutluoz/Desktop/dersTekrari
    - git init yazarak local repo olusturabiliriz
      bu komut workstation(Klasorumuz) ile git'i ilisiklendirir
      bu komut sonucunda "Initialized empty Git repository" yazisi aliriz. Bu islem bir work station icin sadece 1 kere yapilir
      git init komutu ile work station'da gizli bir klasor olusur .git
    - git add .  yazarak work station'daki tum dosyalari local repository'e yuklemek icin hazirliyoruz
      bu komutla git, versiyonlar arasinda sadece eklenen/degistirilen/silinen kisimlari tespit eder
    - git commit -m "commit aciklamasi" :
      git add . ile tespit edilen yedeklenecek kisimlar bir versiyon olusturularak git'e eklenir
      versiyon aciklamasi istedigimiz gibi olabilir, ancak sonradan geri donus ihtimalini dusunerek verdigimiz commit isimlerini anl;amli secmekte fayda vardir
2- Bir work station icin local repo olusturulduktan sonra, yeniden commit almak istedigimizde
    - once terminal/cmd'de derstekrari klasorune gidelim
      users/ahmetbulutluoz/Desktop/dersTekrari
    - git add .
    - git commit -m "commit aciklamasi"
3- Local'de olusturulan bir repo icin github.com'da repo olusturup dosyalarimizi gonderme
    - Once local'de bir repo olusturup, commit yapalim
    - github.com'da local repo'yu yukleyecegimiz bir remote repo olusturalim
    - remote repo'yu ilk defa olusturdugumuzda, yapmamiz gereken islemleri bize yazar
    - bunlardan ilk uc tanesi local repo olusturmakla ilgilidir, biz zaten yapmis oluruz
        git init
        git add README.md
        git commit -m "first commit"
    - sonraki 3 adim ise local repo'yu olusturdugumuz remote repo'ya gondermek icin gereklidir. Copy paste ile bu islemleri yapabiliriz.
        git branch -M main
        git remote add origin https://github.com/bulutluoz/dersTekrari.git
        git push -u origin main



     */
}
