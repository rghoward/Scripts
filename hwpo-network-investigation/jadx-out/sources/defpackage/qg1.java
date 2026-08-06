package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qg1 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends qg1 {
        public int a;
        public int b;
        public final int c;
        public final int d;
        public int e = Integer.MAX_VALUE;

        public a(byte[] bArr, int i, int i2, boolean z) {
            this.a = i2 + i;
            this.c = i;
            this.d = i;
        }

        public final int a(int i) throws gk5 {
            if (i < 0) {
                throw new gk5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            int i2 = (this.c - this.d) + i;
            if (i2 < 0) {
                throw new gk5("Failed to parse the message.");
            }
            int i3 = this.e;
            if (i2 > i3) {
                throw new gk5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.e = i2;
            int i4 = this.a + this.b;
            this.a = i4;
            int i5 = i4 - this.d;
            int i6 = this.e;
            if (i5 > i6) {
                int i7 = i5 - i6;
                this.b = i7;
                this.a = i4 - i7;
            } else {
                this.b = 0;
            }
            return i3;
        }
    }
}
