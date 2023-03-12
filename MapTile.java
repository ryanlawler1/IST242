
public class MapTile {

        int x;
        int y;

        public MapTile(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + x;
            result = prime * result + y;
            return result;
        }
        public boolean equals(Object obj){
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            MapTile other = (MapTile) obj;
            if (y != other.y)
                return false;
            return true;
        }

        public String intro_text() { throw new UnsupportedOperationException();}
        //public void modify_player(Player player) {throw new UnsupportedOperationException();}
    }

