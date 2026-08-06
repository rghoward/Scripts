package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ou6 {
    public final long a;
    public final String b;
    public final String c;
    public final b d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final String i;
    public final String j;
    public final String k;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public enum a implements te8 {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        /* JADX INFO: Fake field, exist only in values array */
        MESSAGE_OPEN(2);

        public final int t;

        a(int i) {
            this.t = i;
        }

        @Override // defpackage.te8
        public final int a() {
            return this.t;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public enum b implements te8 {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN(0),
        DATA_MESSAGE(1),
        /* JADX INFO: Fake field, exist only in values array */
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        public final int t;

        b(int i) {
            this.t = i;
        }

        @Override // defpackage.te8
        public final int a() {
            return this.t;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public enum c implements te8 {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN_OS(0),
        ANDROID(1),
        /* JADX INFO: Fake field, exist only in values array */
        IOS(2),
        /* JADX INFO: Fake field, exist only in values array */
        WEB(3);

        public final int t;

        c(int i) {
            this.t = i;
        }

        @Override // defpackage.te8
        public final int a() {
            return this.t;
        }
    }

    public ou6(long j, String str, String str2, b bVar, String str3, String str4, int i, int i2, String str5, String str6, String str7) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = bVar;
        this.e = str3;
        this.f = str4;
        this.g = i;
        this.h = i2;
        this.i = str5;
        this.j = str6;
        this.k = str7;
    }
}
