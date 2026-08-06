package defpackage;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class v0c extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public v0c(long j, long j2, int i, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbB = ao3.b("Pos: ", j, ", limit: ");
        sbB.append(j2);
        sbB.append(", len: ");
        sbB.append(i);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbB.toString()), indexOutOfBoundsException);
    }

    public v0c(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
