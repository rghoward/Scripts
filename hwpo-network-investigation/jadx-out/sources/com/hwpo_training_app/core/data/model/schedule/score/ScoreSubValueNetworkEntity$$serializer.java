package com.hwpo_training_app.core.data.model.schedule.score;

import defpackage.gk4;
import defpackage.gy2;
import defpackage.ig5;
import defpackage.is0;
import defpackage.ll;
import defpackage.n43;
import defpackage.o2a;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
import defpackage.ry0;
import defpackage.ss5;
import defpackage.st1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@gy2
public final /* synthetic */ class ScoreSubValueNetworkEntity$$serializer implements gk4<ScoreSubValueNetworkEntity> {
    public static final ScoreSubValueNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScoreSubValueNetworkEntity$$serializer scoreSubValueNetworkEntity$$serializer = new ScoreSubValueNetworkEntity$$serializer();
        INSTANCE = scoreSubValueNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.core.data.model.schedule.score.ScoreSubValueNetworkEntity", scoreSubValueNetworkEntity$$serializer, 9);
        o48Var.k("id", false);
        o48Var.k("rounds", true);
        o48Var.k("reps", true);
        o48Var.k("position", false);
        o48Var.k("taken_into", true);
        o48Var.k("value", true);
        o48Var.k("units", false);
        o48Var.k("symbol", false);
        o48Var.k("measure", false);
        descriptor = o48Var;
    }

    private ScoreSubValueNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        ss5<KSerializer<Object>>[] ss5VarArr = ScoreSubValueNetworkEntity.C;
        ig5 ig5Var = ig5.a;
        o2a o2aVar = o2a.a;
        return new KSerializer[]{ig5Var, ry0.a(ig5Var), ry0.a(ig5Var), ig5Var, ry0.a(is0.a), ry0.a(n43.a), o2aVar, o2aVar, ss5VarArr[8].getValue()};
    }

    @Override // defpackage.sy2
    public final ScoreSubValueNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = ScoreSubValueNetworkEntity.C;
        ScoreSubValueNetworkEntity scoreSubValueNetworkEntity = null;
        boolean z = true;
        ScoreMeasureTypeNetworkEntity scoreMeasureTypeNetworkEntity = null;
        Integer num = null;
        Integer num2 = null;
        Boolean bool = null;
        Double d = null;
        String strC0 = null;
        String strC1 = null;
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            switch (iG0) {
                case -1:
                    z = false;
                    continue;
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
                    iR2 = rt1VarN.R(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    bool = (Boolean) rt1VarN.L(serialDescriptor, 4, is0.a, bool);
                    i |= 16;
                    break;
                case 5:
                    d = (Double) rt1VarN.L(serialDescriptor, 5, n43.a, d);
                    i |= 32;
                    break;
                case 6:
                    strC0 = rt1VarN.c0(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    strC1 = rt1VarN.c0(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    scoreMeasureTypeNetworkEntity = (ScoreMeasureTypeNetworkEntity) rt1VarN.J(serialDescriptor, 8, ss5VarArr[8].getValue(), scoreMeasureTypeNetworkEntity);
                    i |= 256;
                    break;
                default:
                    ll.a(iG0);
                    return scoreSubValueNetworkEntity;
            }
            scoreSubValueNetworkEntity = null;
        }
        rt1VarN.i(serialDescriptor);
        return new ScoreSubValueNetworkEntity(i, iR, num, num2, iR2, bool, d, strC0, strC1, scoreMeasureTypeNetworkEntity);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, ScoreSubValueNetworkEntity scoreSubValueNetworkEntity) {
        encoder.getClass();
        scoreSubValueNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = ScoreSubValueNetworkEntity.C;
        int i = scoreSubValueNetworkEntity.t;
        Double d = scoreSubValueNetworkEntity.y;
        Boolean bool = scoreSubValueNetworkEntity.x;
        Integer num = scoreSubValueNetworkEntity.v;
        Integer num2 = scoreSubValueNetworkEntity.u;
        st1VarN.g(0, i, serialDescriptor);
        if (st1VarN.C(serialDescriptor) || num2 != null) {
            st1VarN.z(serialDescriptor, 1, ig5.a, num2);
        }
        if (st1VarN.C(serialDescriptor) || num != null) {
            st1VarN.z(serialDescriptor, 2, ig5.a, num);
        }
        st1VarN.g(3, scoreSubValueNetworkEntity.w, serialDescriptor);
        if (st1VarN.C(serialDescriptor) || bool != null) {
            st1VarN.z(serialDescriptor, 4, is0.a, bool);
        }
        if (st1VarN.C(serialDescriptor) || d != null) {
            st1VarN.z(serialDescriptor, 5, n43.a, d);
        }
        st1VarN.p(serialDescriptor, 6, scoreSubValueNetworkEntity.z);
        st1VarN.p(serialDescriptor, 7, scoreSubValueNetworkEntity.A);
        st1VarN.q(serialDescriptor, 8, ss5VarArr[8].getValue(), scoreSubValueNetworkEntity.B);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
