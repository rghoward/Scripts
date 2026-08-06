package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class fm5 extends ln4 {
    public final h2a x;
    public final ln4 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm5(h2a h2aVar, sl5 sl5Var) {
        super(1);
        sl5Var.getClass();
        this.x = h2aVar;
        this.y = sl5Var.b;
    }

    @Override // defpackage.ln4, kotlinx.serialization.encoding.Decoder
    public final int O() {
        h2a h2aVar = this.x;
        String strJ = h2aVar.j();
        try {
            strJ.getClass();
            r0b r0bVarB = ch.b(strJ);
            if (r0bVarB != null) {
                return r0bVarB.t;
            }
            v2a.e(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            h2a.m(h2aVar, eca.a('\'', "Failed to parse type 'UInt' for input '", strJ), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.ln4, kotlinx.serialization.encoding.Decoder
    public final long Z() {
        h2a h2aVar = this.x;
        String strJ = h2aVar.j();
        try {
            strJ.getClass();
            w0b w0bVarC = ch.c(strJ);
            if (w0bVarC != null) {
                return w0bVarC.t;
            }
            v2a.e(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            h2a.m(h2aVar, eca.a('\'', "Failed to parse type 'ULong' for input '", strJ), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.rt1
    public final int g0(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        throw new IllegalStateException("unsupported");
    }

    @Override // defpackage.rt1
    public final ln4 k() {
        return this.y;
    }

    @Override // defpackage.ln4, kotlinx.serialization.encoding.Decoder
    public final byte q0() {
        m0b m0bVar;
        h2a h2aVar = this.x;
        String strJ = h2aVar.j();
        try {
            strJ.getClass();
            r0b r0bVarB = ch.b(strJ);
            if (r0bVarB != null) {
                int i = r0bVarB.t;
                m0bVar = Integer.compare(Integer.MIN_VALUE ^ i, -2147483393) > 0 ? null : new m0b((byte) i);
            }
            if (m0bVar != null) {
                return m0bVar.t;
            }
            v2a.e(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            h2a.m(h2aVar, eca.a('\'', "Failed to parse type 'UByte' for input '", strJ), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.ln4, kotlinx.serialization.encoding.Decoder
    public final short t0() {
        d1b d1bVar;
        h2a h2aVar = this.x;
        String strJ = h2aVar.j();
        try {
            strJ.getClass();
            r0b r0bVarB = ch.b(strJ);
            if (r0bVarB != null) {
                int i = r0bVarB.t;
                d1bVar = Integer.compare(Integer.MIN_VALUE ^ i, -2147418113) > 0 ? null : new d1b((short) i);
            }
            if (d1bVar != null) {
                return d1bVar.t;
            }
            v2a.e(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            h2a.m(h2aVar, eca.a('\'', "Failed to parse type 'UShort' for input '", strJ), 0, null, 6);
            throw null;
        }
    }
}
