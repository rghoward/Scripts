package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface wu6 {
    public static final a a = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements wu6 {
        public final ln4 a(id4 id4Var) {
            String str = id4Var.o;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new q10(20);
                    case "application/x-icy":
                        return new q65();
                    case "application/id3":
                        return new u65(null);
                    case "application/x-emsg":
                        return new um3(20);
                    case "application/x-scte35":
                        return new fy9();
                }
            }
            z90.a(ct1.a("Attempted to create decoder for unsupported MIME type: ", str));
            return null;
        }

        public final boolean b(id4 id4Var) {
            String str = id4Var.o;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }
    }
}
