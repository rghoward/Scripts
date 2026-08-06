package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class ge9 {
    public static final b Companion = new b();
    public static final ss5<KSerializer<Object>>[] d = {null, null, hv5.c(j26.t, new xz4(1))};
    public final re9 a;
    public final tma b;
    public final Map<String, y98> c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @gy2
    public /* synthetic */ class a implements gk4<ge9> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            o48 o48Var = new o48("com.google.firebase.sessions.SessionData", aVar, 3);
            o48Var.k("sessionDetails", false);
            o48Var.k("backgroundTime", true);
            o48Var.k("processDataMap", true);
            descriptor = o48Var;
        }

        @Override // defpackage.gk4
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{re9.a.a, ry0.a(tma.a.a), ry0.a(ge9.d[2].getValue())};
        }

        @Override // defpackage.sy2
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            rt1 rt1VarN = decoder.n(serialDescriptor);
            ss5<KSerializer<Object>>[] ss5VarArr = ge9.d;
            boolean z = true;
            int i = 0;
            re9 re9Var = null;
            tma tmaVar = null;
            Map map = null;
            while (z) {
                int iG0 = rt1VarN.g0(serialDescriptor);
                if (iG0 == -1) {
                    z = false;
                } else if (iG0 == 0) {
                    re9Var = (re9) rt1VarN.J(serialDescriptor, 0, re9.a.a, re9Var);
                    i |= 1;
                } else if (iG0 == 1) {
                    tmaVar = (tma) rt1VarN.L(serialDescriptor, 1, tma.a.a, tmaVar);
                    i |= 2;
                } else {
                    if (iG0 != 2) {
                        ll.a(iG0);
                        return null;
                    }
                    map = (Map) rt1VarN.L(serialDescriptor, 2, ss5VarArr[2].getValue(), map);
                    i |= 4;
                }
            }
            rt1VarN.i(serialDescriptor);
            return new ge9(i, re9Var, tmaVar, map);
        }

        @Override // defpackage.ud9, defpackage.sy2
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.ud9
        public final void serialize(Encoder encoder, Object obj) {
            ge9 ge9Var = (ge9) obj;
            ge9Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            st1 st1VarN = encoder.n(serialDescriptor);
            ss5<KSerializer<Object>>[] ss5VarArr = ge9.d;
            re9.a aVar = re9.a.a;
            re9 re9Var = ge9Var.a;
            Map<String, y98> map = ge9Var.c;
            tma tmaVar = ge9Var.b;
            st1VarN.q(serialDescriptor, 0, aVar, re9Var);
            if (st1VarN.C(serialDescriptor) || tmaVar != null) {
                st1VarN.z(serialDescriptor, 1, tma.a.a, tmaVar);
            }
            if (st1VarN.C(serialDescriptor) || map != null) {
                st1VarN.z(serialDescriptor, 2, ss5VarArr[2].getValue(), map);
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
        public final KSerializer<ge9> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ ge9(int i, re9 re9Var, tma tmaVar, Map map) {
        if (1 != (i & 1)) {
            hl3.b(i, 1, a.a.getDescriptor());
            throw null;
        }
        this.a = re9Var;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = tmaVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
    }

    public static ge9 a(ge9 ge9Var, re9 re9Var, tma tmaVar, Map map, int i) {
        if ((i & 1) != 0) {
            re9Var = ge9Var.a;
        }
        if ((i & 2) != 0) {
            tmaVar = ge9Var.b;
        }
        if ((i & 4) != 0) {
            map = ge9Var.c;
        }
        ge9Var.getClass();
        re9Var.getClass();
        return new ge9(re9Var, tmaVar, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge9)) {
            return false;
        }
        ge9 ge9Var = (ge9) obj;
        return xj5.a(this.a, ge9Var.a) && xj5.a(this.b, ge9Var.b) && xj5.a(this.c, ge9Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tma tmaVar = this.b;
        int iHashCode2 = (iHashCode + (tmaVar == null ? 0 : Long.hashCode(tmaVar.a))) * 31;
        Map<String, y98> map = this.c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.a + ", backgroundTime=" + this.b + ", processDataMap=" + this.c + ')';
    }

    public ge9(re9 re9Var, tma tmaVar, Map<String, y98> map) {
        re9Var.getClass();
        this.a = re9Var;
        this.b = tmaVar;
        this.c = map;
    }
}
