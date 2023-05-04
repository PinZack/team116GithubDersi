package day01;

public class C02 {

    public static void main(String[] args) {


        /*
        Kisisel kullanimda eski commitlere donmek istedigimizde
        tek bir git komutu yeterli olur
        ancak islemi yapmadan once projemizde commit yaparak
        son halini git'e gondermeliyiz
        Senaryo : eski bir commit'e gidip orada inceleme yaptiktan sonra
                  projenin son haline geri donun
        1- projenin son halini commit yapin
        2- git log --oneline diyerek tum commit gecmisini gorun
        3- istediginiz commit'e gitmek icin git checkout 123456
           (istenen commit'in hash kodunun ilk 7 hanesi)
        4- istedigimiz commit'i inceledik ve projenin son haline donmek istiyorsak
           git checkout 234567 (son kommit'in hash kodu)
        Senaryo : son yapilan commit'i gecersiz kilip,
                  bir onceki commit'e donun
            1- son halini commit yapin
            2- revert islemi icin git revert 1234567
                (geriye almak istedigim commit)

                NOT : geriye donme islemlerinde
                      local repo ile remote repo birbirinden farklilasacagi icin
                      geriye dondugumuzde baska islem yapmadan
                      remote repo'yu guncellemek gerekir.


            checkout : commit'ler arasinda gecis yapar
            revert  : geriye dondurur ve o halini oto matik olarak commit yapar
                      yani kalici olarak geriye dondurmus olur



                    Senaryo : github'da begendigim bir repo'yu kendi local'ime indirme ve kendi projem haline getirme
    1- kendi bilgisayarimizda bir klasor olusturalim
    2- klasoru git klasoru yapalim  :   git init
    3- github.com'dan istedigimiz remote repo'nun linkini kopyalayalim
    4- url'i kullanarak remote repo'yu kendi klasorumuze indirelim : git pull url
    5- dosya uzerinde hem kendi olusturdugumuz git dosyalari, hem de remote repo'dan indirilen git dosyalari oldugu icin karisiklik olabilir. .git dosyasini silerek eski git dosyalarindan kurtulalim
    6- bu klasor yeni ve bize ait bir klasor haline geldi, bundan sonra ne yapmak istersek o islemleri takip edebbiliriz


         */



    }

}
