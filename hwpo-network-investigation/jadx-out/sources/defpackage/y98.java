package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class y98 {
    public static final b Companion = new b();
    public final int a;
    public final String b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @gy2
    public /* synthetic */ class a implements gk4<y98> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            o48 o48Var = new o48("com.google.firebase.sessions.ProcessData", aVar, 2);
            o48Var.k("pid", false);
            o48Var.k("uuid", false);
            descriptor = o48Var;
        }

        @Override // defpackage.gk4
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{ig5.a, o2a.a};
        }

        @Override // defpackage.sy2
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            rt1 rt1VarN = decoder.n(serialDescriptor);
            boolean z = true;
            int i = 0;
            int iR = 0;
            String strC0 = null;
            while (z) {
                int iG0 = rt1VarN.g0(serialDescriptor);
                if (iG0 == -1) {
                    z = false;
                } else if (iG0 == 0) {
                    iR = rt1VarN.R(serialDescriptor, 0);
                    i |= 1;
                } else {
                    if (iG0 != 1) {
                        ll.a(iG0);
                        return null;
                    }
                    strC0 = rt1VarN.c0(serialDescriptor, 1);
                    i |= 2;
                }
            }
            rt1VarN.i(serialDescriptor);
            return new y98(i, iR, strC0);
        }

        @Override // defpackage.ud9, defpackage.sy2
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.ud9
        public final void serialize(Encoder encoder, Object obj) {
            y98 y98Var = (y98) obj;
            y98Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            st1 st1VarN = encoder.n(serialDescriptor);
            st1VarN.g(0, y98Var.a, serialDescriptor);
            st1VarN.p(serialDescriptor, 1, y98Var.b);
            st1VarN.i(serialDescriptor);
        }

        @Override // defpackage.gk4
        public final KSerializer<?>[] typeParametersSerializers() {
            return p48.t;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final KSerializer<y98> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ y98(int i, int i2, String str) {
        if (3 != (i & 3)) {
            hl3.b(i, 3, a.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y98)) {
            return false;
        }
        y98 y98Var = (y98) obj;
        return this.a == y98Var.a && xj5.a(this.b, y98Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessData(pid=");
        sb.append(this.a);
        sb.append(", uuid=");
        return wu0.a(sb, this.b, ')');
    }

    public y98(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }
}
