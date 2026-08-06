package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class re9 {
    public static final b Companion = new b();
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @gy2
    public /* synthetic */ class a implements gk4<re9> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            o48 o48Var = new o48("com.google.firebase.sessions.SessionDetails", aVar, 4);
            o48Var.k("sessionId", false);
            o48Var.k("firstSessionId", false);
            o48Var.k("sessionIndex", false);
            o48Var.k("sessionStartTimestampUs", false);
            descriptor = o48Var;
        }

        @Override // defpackage.gk4
        public final KSerializer<?>[] childSerializers() {
            o2a o2aVar = o2a.a;
            return new KSerializer[]{o2aVar, o2aVar, ig5.a, ue6.a};
        }

        @Override // defpackage.sy2
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            rt1 rt1VarN = decoder.n(serialDescriptor);
            int i = 0;
            int iR = 0;
            String strC0 = null;
            String strC1 = null;
            long jG = 0;
            boolean z = true;
            while (z) {
                int iG0 = rt1VarN.g0(serialDescriptor);
                if (iG0 == -1) {
                    z = false;
                } else if (iG0 == 0) {
                    strC0 = rt1VarN.c0(serialDescriptor, 0);
                    i |= 1;
                } else if (iG0 == 1) {
                    strC1 = rt1VarN.c0(serialDescriptor, 1);
                    i |= 2;
                } else if (iG0 == 2) {
                    iR = rt1VarN.R(serialDescriptor, 2);
                    i |= 4;
                } else {
                    if (iG0 != 3) {
                        ll.a(iG0);
                        return null;
                    }
                    jG = rt1VarN.G(serialDescriptor, 3);
                    i |= 8;
                }
            }
            rt1VarN.i(serialDescriptor);
            return new re9(i, strC0, strC1, iR, jG);
        }

        @Override // defpackage.ud9, defpackage.sy2
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.ud9
        public final void serialize(Encoder encoder, Object obj) {
            re9 re9Var = (re9) obj;
            re9Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            st1 st1VarN = encoder.n(serialDescriptor);
            st1VarN.p(serialDescriptor, 0, re9Var.a);
            st1VarN.p(serialDescriptor, 1, re9Var.b);
            st1VarN.g(2, re9Var.c, serialDescriptor);
            st1VarN.B(serialDescriptor, 3, re9Var.d);
            st1VarN.i(serialDescriptor);
        }

        @Override // defpackage.gk4
        public final KSerializer<?>[] typeParametersSerializers() {
            return p48.t;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final KSerializer<re9> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ re9(int i, String str, String str2, int i2, long j) {
        if (15 != (i & 15)) {
            hl3.b(i, 15, a.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re9)) {
            return false;
        }
        re9 re9Var = (re9) obj;
        return xj5.a(this.a, re9Var.a) && xj5.a(this.b, re9Var.b) && this.c == re9Var.c && this.d == re9Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + os2.a(this.c, ru3.c(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionDetails(sessionId=");
        sb.append(this.a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", sessionStartTimestampUs=");
        return fh0.b(sb, this.d, ')');
    }

    public re9(String str, String str2, int i, long j) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }
}
