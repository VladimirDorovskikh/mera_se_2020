import com.mera.lection6.SimpleBox;

public class BoxAlternative {

    class IntegerBox {
        Integer integer;

        public Integer getInteger() {
            return integer;
        }

        public void setInteger(Integer integer) {
            this.integer = integer;
        }
    }


    class IntegerBoxExtended extends SimpleBox {
        public Integer getItem() {
            return (Integer) super.getItem();
        }

        public void setItem(Integer item) {
            super.setItem(item);
        }
    }

}
