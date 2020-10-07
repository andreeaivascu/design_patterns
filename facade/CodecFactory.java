public class CodecFactory {
    public static class extract extends CodecFactory {
        public extract(VideoFile file) {
            super();
        }

        public VideoFile extract(VideoFile file) {
          return file;
        }
    }
}
