package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class ee9 {
    public static final b Companion = new b();
    public final Boolean a;
    public final Double b;
    public final Integer c;
    public final Integer d;
    public final Long e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @gy2
    public /* synthetic */ class a implements gk4<ee9> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            o48 o48Var = new o48("com.google.firebase.sessions.settings.SessionConfigs", aVar, 5);
            o48Var.k("sessionsEnabled", false);
            o48Var.k("sessionSamplingRate", false);
            o48Var.k("sessionTimeoutSeconds", false);
            o48Var.k("cacheDurationSeconds", false);
            o48Var.k("cacheUpdatedTimeSeconds", false);
            descriptor = o48Var;
        }

        @Override // defpackage.gk4
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?> kSerializerA = ry0.a(is0.a);
            KSerializer<?> kSerializerA2 = ry0.a(n43.a);
            ig5 ig5Var = ig5.a;
            return new KSerializer[]{kSerializerA, kSerializerA2, ry0.a(ig5Var), ry0.a(ig5Var), ry0.a(ue6.a)};
        }

        @Override // defpackage.sy2
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            rt1 rt1VarN = decoder.n(serialDescriptor);
            boolean z = true;
            int i = 0;
            Boolean bool = null;
            Double d = null;
            Integer num = null;
            Integer num2 = null;
            Long l = null;
            while (z) {
                int iG0 = rt1VarN.g0(serialDescriptor);
                if (iG0 == -1) {
                    z = false;
                } else if (iG0 == 0) {
                    bool = (Boolean) rt1VarN.L(serialDescriptor, 0, is0.a, bool);
                    i |= 1;
                } else if (iG0 == 1) {
                    d = (Double) rt1VarN.L(serialDescriptor, 1, n43.a, d);
                    i |= 2;
                } else if (iG0 == 2) {
                    num = (Integer) rt1VarN.L(serialDescriptor, 2, ig5.a, num);
                    i |= 4;
                } else if (iG0 == 3) {
                    num2 = (Integer) rt1VarN.L(serialDescriptor, 3, ig5.a, num2);
                    i |= 8;
                } else {
                    if (iG0 != 4) {
                        ll.a(iG0);
                        return null;
                    }
                    l = (Long) rt1VarN.L(serialDescriptor, 4, ue6.a, l);
                    i |= 16;
                }
            }
            rt1VarN.i(serialDescriptor);
            return new ee9(i, bool, d, num, num2, l);
        }

        @Override // defpackage.ud9, defpackage.sy2
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.ud9
        public final void serialize(Encoder encoder, Object obj) {
            ee9 ee9Var = (ee9) obj;
            ee9Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            st1 st1VarN = encoder.n(serialDescriptor);
            st1VarN.z(serialDescriptor, 0, is0.a, ee9Var.a);
            st1VarN.z(serialDescriptor, 1, n43.a, ee9Var.b);
            ig5 ig5Var = ig5.a;
            st1VarN.z(serialDescriptor, 2, ig5Var, ee9Var.c);
            st1VarN.z(serialDescriptor, 3, ig5Var, ee9Var.d);
            st1VarN.z(serialDescriptor, 4, ue6.a, ee9Var.e);
            st1VarN.i(serialDescriptor);
        }

        @Override // defpackage.gk4
        public final KSerializer<?>[] typeParametersSerializers() {
            return p48.t;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final KSerializer<ee9> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ ee9(int i, Boolean bool, Double d, Integer num, Integer num2, Long l) {
        if (31 != (i & 31)) {
            hl3.b(i, 31, a.a.getDescriptor());
            throw null;
        }
        this.a = bool;
        this.b = d;
        this.c = num;
        this.d = num2;
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee9)) {
            return false;
        }
        ee9 ee9Var = (ee9) obj;
        return xj5.a(this.a, ee9Var.a) && xj5.a(this.b, ee9Var.b) && xj5.a(this.c, ee9Var.c) && xj5.a(this.d, ee9Var.d) && xj5.a(this.e, ee9Var.e);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.e;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.a + ", sessionSamplingRate=" + this.b + ", sessionTimeoutSeconds=" + this.c + ", cacheDurationSeconds=" + this.d + ", cacheUpdatedTimeSeconds=" + this.e + ')';
    }

    public ee9(Boolean bool, Double d, Integer num, Integer num2, Long l) {
        this.a = bool;
        this.b = d;
        this.c = num;
        this.d = num2;
        this.e = l;
    }
}
