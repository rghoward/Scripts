package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class p93 implements KSerializer<l93> {
    public static final p93 a = new p93();
    public static final m98 b = new m98("kotlin.time.Duration", j98.i.a);

    @Override // defpackage.sy2
    public final Object deserialize(Decoder decoder) {
        l93.a aVar = l93.u;
        String strS = decoder.S();
        strS.getClass();
        try {
            long jE = o93.e(strS);
            if (jE == l93.x) {
                throw new IllegalStateException("invariant failed");
            }
            return new l93(jE);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(sk0.c("Invalid ISO duration string format: '", strS, "'."), e);
        }
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, Object obj) {
        long j = ((l93) obj).t;
        l93.a aVar = l93.u;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long jK = j < 0 ? l93.k(j) : j;
        long j2 = l93.j(jK, q93.HOURS);
        boolean z = false;
        int iJ = l93.h(jK) ? 0 : (int) (l93.j(jK, q93.MINUTES) % 60);
        int iJ2 = l93.h(jK) ? 0 : (int) (l93.j(jK, q93.SECONDS) % 60);
        int iG = l93.g(jK);
        if (l93.h(j)) {
            j2 = 9999999999999L;
        }
        boolean z2 = j2 != 0;
        boolean z3 = (iJ2 == 0 && iG == 0) ? false : true;
        if (iJ != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(j2);
            sb.append('H');
        }
        if (z) {
            sb.append(iJ);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            l93.e(sb, iJ2, iG, 9, "S", true);
        }
        encoder.D(sb.toString());
    }
}
