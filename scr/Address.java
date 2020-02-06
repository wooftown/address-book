/**
 * Класс адреса, который хранит:
 * улицу, дом, квартиру.
 */
class Address {
    private final String street;
    private final int number;
    private final int flat;

    Address(String street, int number, int flat) {
        this.street = street;
        this.number = number;
        this.flat = flat;
    }

    public int getFlat() {
        return flat;
    }

    public int getNumber() {
        return number;
    }

    public String getStreet() {
        return street;
    }

    @Override
    public String toString() {
        return street + " " + number + " " + flat;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = result * prime + street.hashCode();
        result = result * prime + number;
        result = result * prime + flat;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass() || hashCode() != o.hashCode()) {
            return false;
        }
        Address other = (Address) o;
        return (other.street.equals(street)) && (other.number == number) && (other.flat == flat);
    }
}