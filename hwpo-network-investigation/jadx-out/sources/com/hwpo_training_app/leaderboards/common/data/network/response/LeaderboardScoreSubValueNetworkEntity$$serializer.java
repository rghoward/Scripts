package com.hwpo_training_app.leaderboards.common.data.network.response;

import defpackage.gk4;
import defpackage.gy2;
import defpackage.ig5;
import defpackage.is0;
import defpackage.ll;
import defpackage.o2a;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
import defpackage.ry0;
import defpackage.ss5;
import defpackage.st1;
import defpackage.w44;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@gy2
public final /* synthetic */ class LeaderboardScoreSubValueNetworkEntity$$serializer implements gk4<LeaderboardScoreSubValueNetworkEntity> {
    public static final LeaderboardScoreSubValueNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LeaderboardScoreSubValueNetworkEntity$$serializer leaderboardScoreSubValueNetworkEntity$$serializer = new LeaderboardScoreSubValueNetworkEntity$$serializer();
        INSTANCE = leaderboardScoreSubValueNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardScoreSubValueNetworkEntity", leaderboardScoreSubValueNetworkEntity$$serializer, 9);
        o48Var.k("id", false);
        o48Var.k("rounds", true);
        o48Var.k("reps", true);
        o48Var.k("position", false);
        o48Var.k("taken_into", true);
        o48Var.k("value", false);
        o48Var.k("units", false);
        o48Var.k("symbol", false);
        o48Var.k("measure", false);
        descriptor = o48Var;
    }

    private LeaderboardScoreSubValueNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        ss5<KSerializer<Object>>[] ss5VarArr = LeaderboardScoreSubValueNetworkEntity.j;
        ig5 ig5Var = ig5.a;
        o2a o2aVar = o2a.a;
        return new KSerializer[]{ig5Var, ry0.a(ig5Var), ry0.a(ig5Var), ig5Var, ry0.a(is0.a), w44.a, o2aVar, o2aVar, ss5VarArr[8].getValue()};
    }

    @Override // defpackage.sy2
    public final LeaderboardScoreSubValueNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = LeaderboardScoreSubValueNetworkEntity.j;
        LeaderboardScoreSubValueNetworkEntity leaderboardScoreSubValueNetworkEntity = null;
        LeaderboardMeasureNetworkEntity leaderboardMeasureNetworkEntity = null;
        Integer num = null;
        Integer num2 = null;
        Boolean bool = null;
        String strC0 = null;
        String strC1 = null;
        float fW0 = 0.0f;
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        boolean z = true;
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
                    fW0 = rt1VarN.w0(serialDescriptor, 5);
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
                    leaderboardMeasureNetworkEntity = (LeaderboardMeasureNetworkEntity) rt1VarN.J(serialDescriptor, 8, ss5VarArr[8].getValue(), leaderboardMeasureNetworkEntity);
                    i |= 256;
                    break;
                default:
                    ll.a(iG0);
                    return leaderboardScoreSubValueNetworkEntity;
            }
            leaderboardScoreSubValueNetworkEntity = null;
        }
        rt1VarN.i(serialDescriptor);
        return new LeaderboardScoreSubValueNetworkEntity(i, iR, num, num2, iR2, bool, fW0, strC0, strC1, leaderboardMeasureNetworkEntity);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, LeaderboardScoreSubValueNetworkEntity leaderboardScoreSubValueNetworkEntity) {
        encoder.getClass();
        leaderboardScoreSubValueNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = LeaderboardScoreSubValueNetworkEntity.j;
        int i = leaderboardScoreSubValueNetworkEntity.a;
        Boolean bool = leaderboardScoreSubValueNetworkEntity.e;
        Integer num = leaderboardScoreSubValueNetworkEntity.c;
        Integer num2 = leaderboardScoreSubValueNetworkEntity.b;
        st1VarN.g(0, i, serialDescriptor);
        if (st1VarN.C(serialDescriptor) || num2 != null) {
            st1VarN.z(serialDescriptor, 1, ig5.a, num2);
        }
        if (st1VarN.C(serialDescriptor) || num != null) {
            st1VarN.z(serialDescriptor, 2, ig5.a, num);
        }
        st1VarN.g(3, leaderboardScoreSubValueNetworkEntity.d, serialDescriptor);
        if (st1VarN.C(serialDescriptor) || bool != null) {
            st1VarN.z(serialDescriptor, 4, is0.a, bool);
        }
        st1VarN.f(serialDescriptor, 5, leaderboardScoreSubValueNetworkEntity.f);
        st1VarN.p(serialDescriptor, 6, leaderboardScoreSubValueNetworkEntity.g);
        st1VarN.p(serialDescriptor, 7, leaderboardScoreSubValueNetworkEntity.h);
        st1VarN.q(serialDescriptor, 8, ss5VarArr[8].getValue(), leaderboardScoreSubValueNetworkEntity.i);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
