package com.hwpo_training_app.core.data.model.schedule.score;

import defpackage.gk4;
import defpackage.gy2;
import defpackage.ig5;
import defpackage.is0;
import defpackage.ll;
import defpackage.n43;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
import defpackage.ry0;
import defpackage.ss5;
import defpackage.st1;
import defpackage.xj5;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@gy2
public final /* synthetic */ class ScoreValueNetworkEntity$$serializer implements gk4<ScoreValueNetworkEntity> {
    public static final ScoreValueNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScoreValueNetworkEntity$$serializer scoreValueNetworkEntity$$serializer = new ScoreValueNetworkEntity$$serializer();
        INSTANCE = scoreValueNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.core.data.model.schedule.score.ScoreValueNetworkEntity", scoreValueNetworkEntity$$serializer, 9);
        o48Var.k("id", false);
        o48Var.k("rounds", false);
        o48Var.k("reps", false);
        o48Var.k("value", true);
        o48Var.k("adjusted", true);
        o48Var.k("position", true);
        o48Var.k("score_sub_values", true);
        o48Var.k("show_attachments", true);
        o48Var.k("show_performance", true);
        descriptor = o48Var;
    }

    private ScoreValueNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        ss5<KSerializer<Object>>[] ss5VarArr = ScoreValueNetworkEntity.C;
        ig5 ig5Var = ig5.a;
        KSerializer<?> kSerializerA = ry0.a(ig5Var);
        KSerializer<?> kSerializerA2 = ry0.a(ig5Var);
        KSerializer<?> kSerializerA3 = ry0.a(n43.a);
        is0 is0Var = is0.a;
        return new KSerializer[]{ig5Var, kSerializerA, kSerializerA2, kSerializerA3, ry0.a(is0Var), ry0.a(ig5Var), ry0.a(ss5VarArr[6].getValue()), ry0.a(is0Var), ry0.a(is0Var)};
    }

    @Override // defpackage.sy2
    public final ScoreValueNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = ScoreValueNetworkEntity.C;
        Boolean bool = null;
        boolean z = true;
        Boolean bool2 = null;
        int i = 0;
        int iR = 0;
        Integer num = null;
        Integer num2 = null;
        Double d = null;
        Boolean bool3 = null;
        Integer num3 = null;
        List list = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            switch (iG0) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iR = rt1VarN.R(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) rt1VarN.L(serialDescriptor, 1, ig5.a, num);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) rt1VarN.L(serialDescriptor, 2, ig5.a, num2);
                    i |= 4;
                    break;
                case 3:
                    d = (Double) rt1VarN.L(serialDescriptor, 3, n43.a, d);
                    i |= 8;
                    break;
                case 4:
                    bool3 = (Boolean) rt1VarN.L(serialDescriptor, 4, is0.a, bool3);
                    i |= 16;
                    break;
                case 5:
                    num3 = (Integer) rt1VarN.L(serialDescriptor, 5, ig5.a, num3);
                    i |= 32;
                    break;
                case 6:
                    list = (List) rt1VarN.L(serialDescriptor, 6, ss5VarArr[6].getValue(), list);
                    i |= 64;
                    break;
                case 7:
                    bool2 = (Boolean) rt1VarN.L(serialDescriptor, 7, is0.a, bool2);
                    i |= 128;
                    break;
                case 8:
                    bool = (Boolean) rt1VarN.L(serialDescriptor, 8, is0.a, bool);
                    i |= 256;
                    break;
                default:
                    ll.a(iG0);
                    return null;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new ScoreValueNetworkEntity(i, iR, num, num2, d, bool3, num3, list, bool2, bool);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, ScoreValueNetworkEntity scoreValueNetworkEntity) {
        encoder.getClass();
        scoreValueNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = ScoreValueNetworkEntity.C;
        int i = scoreValueNetworkEntity.t;
        Boolean bool = scoreValueNetworkEntity.B;
        Boolean bool2 = scoreValueNetworkEntity.A;
        List<ScoreSubValueNetworkEntity> list = scoreValueNetworkEntity.z;
        Integer num = scoreValueNetworkEntity.y;
        Boolean bool3 = scoreValueNetworkEntity.x;
        Double d = scoreValueNetworkEntity.w;
        st1VarN.g(0, i, serialDescriptor);
        ig5 ig5Var = ig5.a;
        st1VarN.z(serialDescriptor, 1, ig5Var, scoreValueNetworkEntity.u);
        st1VarN.z(serialDescriptor, 2, ig5Var, scoreValueNetworkEntity.v);
        if (st1VarN.C(serialDescriptor) || d != null) {
            st1VarN.z(serialDescriptor, 3, n43.a, d);
        }
        if (st1VarN.C(serialDescriptor) || bool3 != null) {
            st1VarN.z(serialDescriptor, 4, is0.a, bool3);
        }
        if (st1VarN.C(serialDescriptor) || num != null) {
            st1VarN.z(serialDescriptor, 5, ig5Var, num);
        }
        if (st1VarN.C(serialDescriptor) || list != null) {
            st1VarN.z(serialDescriptor, 6, ss5VarArr[6].getValue(), list);
        }
        if (st1VarN.C(serialDescriptor) || !xj5.a(bool2, Boolean.FALSE)) {
            st1VarN.z(serialDescriptor, 7, is0.a, bool2);
        }
        if (st1VarN.C(serialDescriptor) || !xj5.a(bool, Boolean.FALSE)) {
            st1VarN.z(serialDescriptor, 8, is0.a, bool);
        }
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
