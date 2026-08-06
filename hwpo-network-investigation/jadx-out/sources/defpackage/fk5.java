package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class fk5 extends IOException {
    public boolean t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends fk5 {
    }

    public static fk5 a() {
        return new fk5("Protocol message had invalid UTF-8.");
    }

    public static a b() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static fk5 c() {
        return new fk5("CodedInputStream encountered a malformed varint.");
    }

    public static fk5 d() {
        return new fk5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static fk5 e() {
        return new fk5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
