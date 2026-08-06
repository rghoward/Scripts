package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class tma {
    public static final b Companion = new b();
    public final long a;
    public final long b;
    public final long c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @gy2
    public /* synthetic */ class a implements gk4<tma> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            o48 o48Var = new o48("com.google.firebase.sessions.Time", aVar, 3);
            o48Var.k("ms", false);
            o48Var.k("us", true);
            o48Var.k("seconds", true);
            descriptor = o48Var;
        }

        @Override // defpackage.gk4
        public final KSerializer<?>[] childSerializers() {
            ue6 ue6Var = ue6.a;
            return new KSerializer[]{ue6Var, ue6Var, ue6Var};
        }

        @Override // defpackage.sy2
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            rt1 rt1VarN = decoder.n(serialDescriptor);
            int i = 0;
            long jG = 0;
            long jG2 = 0;
            long jG3 = 0;
            boolean z = true;
            while (z) {
                int iG0 = rt1VarN.g0(serialDescriptor);
                if (iG0 == -1) {
                    z = false;
                } else if (iG0 == 0) {
                    jG = rt1VarN.G(serialDescriptor, 0);
                    i |= 1;
                } else if (iG0 == 1) {
                    jG2 = rt1VarN.G(serialDescriptor, 1);
                    i |= 2;
                } else {
                    if (iG0 != 2) {
                        ll.a(iG0);
                        return null;
                    }
                    jG3 = rt1VarN.G(serialDescriptor, 2);
                    i |= 4;
                }
            }
            rt1VarN.i(serialDescriptor);
            return new tma(i, jG, jG2, jG3);
        }

        @Override // defpackage.ud9, defpackage.sy2
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.ud9
        public final void serialize(Encoder encoder, Object obj) {
            tma tmaVar = (tma) obj;
            tmaVar.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            st1 st1VarN = encoder.n(serialDescriptor);
            long j = tmaVar.a;
            long j2 = tmaVar.c;
            long j3 = tmaVar.b;
            st1VarN.B(serialDescriptor, 0, j);
            if (st1VarN.C(serialDescriptor) || j3 != j * 1000) {
                st1VarN.B(serialDescriptor, 1, j3);
            }
            if (st1VarN.C(serialDescriptor) || j2 != j / 1000) {
                st1VarN.B(serialDescriptor, 2, j2);
            }
            st1VarN.i(serialDescriptor);
        }

        @Override // defpackage.gk4
        public final KSerializer<?>[] typeParametersSerializers() {
            return p48.t;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final KSerializer<tma> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ tma(int i, long j, long j2, long j3) {
        if (1 != (i & 1)) {
            hl3.b(i, 1, a.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = (i & 2) == 0 ? j * 1000 : j2;
        if ((i & 4) == 0) {
            this.c = j / 1000;
        } else {
            this.c = j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tma) && this.a == ((tma) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return fh0.b(new StringBuilder("Time(ms="), this.a, ')');
    }

    public tma(long j) {
        this.a = j;
        this.b = j * 1000;
        this.c = j / 1000;
    }
}
