package Praktikum.sesi12.Quiz;

// Interface Phone
interface Phone {
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}

// Class Xiaomi
class Xiaomi implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Xiaomi() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Xiaomi: Power On");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Xiaomi: Power Off");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn && volume < MAX_VOLUME) {
            volume += 10;
            System.out.println("Xiaomi: Volume Up, Volume = " + volume);
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn && volume > MIN_VOLUME) {
            volume -= 10;
            System.out.println("Xiaomi: Volume Down, Volume = " + volume);
        }
    }
}

// Class iPhone
class iPhone implements Phone {
    private int volume;
    private boolean isPowerOn;

    public iPhone() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("iPhone: Power On");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("iPhone: Power Off");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn && volume < MAX_VOLUME) {
            volume += 10;
            System.out.println("iPhone: Volume Up, Volume = " + volume);
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn && volume > MIN_VOLUME) {
            volume -= 10;
            System.out.println("iPhone: Volume Down, Volume = " + volume);
        }
    }
}

// Class Samsung
class Samsung implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Samsung() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Samsung: Power On");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Samsung: Power Off");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn && volume < MAX_VOLUME) {
            volume += 10;
            System.out.println("Samsung: Volume Up, Volume = " + volume);
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn && volume > MIN_VOLUME) {
            volume -= 10;
            System.out.println("Samsung: Volume Down, Volume = " + volume);
        }
    }
}

// Class Oppo
class Oppo implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Oppo() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Oppo: Power On");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Oppo: Power Off");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn && volume < MAX_VOLUME) {
            volume += 10;
            System.out.println("Oppo: Volume Up, Volume = " + volume);
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn && volume > MIN_VOLUME) {
            volume -= 10;
            System.out.println("Oppo: Volume Down, Volume = " + volume);
        }
    }
}

// Class PhoneUser
class PhoneUser {
    private Phone phone;

    public PhoneUser(Phone phone) {
        this.phone = phone;
    }

    public void turnOnThePhone() {
        phone.powerOn();
    }

    public void turnOffThePhone() {
        phone.powerOff();
    }

    public void makePhoneLouder() {
        phone.volumeUp();
    }

    public void makePhoneSilent() {
        phone.volumeDown();
    }
}

// Class Main
public class PhoneSystem {
    public static void main(String[] args) {
        // Array of phones
        Phone[] phones = {
            new Xiaomi(),
            new iPhone(),
            new Samsung(),
            new Oppo()
        };

        for (Phone phone : phones) {
            PhoneUser user = new PhoneUser(phone);
            System.out.println("\nTesting " + phone.getClass().getSimpleName() + ":");
            user.turnOnThePhone();
            user.makePhoneLouder();
            user.makePhoneLouder();
            user.makePhoneSilent();
            user.turnOffThePhone();
        }
    }
}