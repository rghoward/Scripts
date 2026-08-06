package com.hwpo_training_app.leaderboards.common.data.network.response;

import com.hwpo_training_app.leaderboards.common.data.network.request.LeaderboardPlanTypeNetworkEntity;
import defpackage.gk4;
import defpackage.gy2;
import defpackage.ig5;
import defpackage.ll;
import defpackage.o2a;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
import defpackage.ss5;
import defpackage.st1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@gy2
public final /* synthetic */ class LeaderboardPlanNetworkEntity$$serializer implements gk4<LeaderboardPlanNetworkEntity> {
    public static final LeaderboardPlanNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LeaderboardPlanNetworkEntity$$serializer leaderboardPlanNetworkEntity$$serializer = new LeaderboardPlanNetworkEntity$$serializer();
        INSTANCE = leaderboardPlanNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardPlanNetworkEntity", leaderboardPlanNetworkEntity$$serializer, 3);
        o48Var.k("id", false);
        o48Var.k("title", false);
        o48Var.k("plan_type", false);
        descriptor = o48Var;
    }

    private LeaderboardPlanNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{ig5.a, o2a.a, LeaderboardPlanNetworkEntity.d[2].getValue()};
    }

    @Override // defpackage.sy2
    public final LeaderboardPlanNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = LeaderboardPlanNetworkEntity.d;
        boolean z = true;
        int i = 0;
        int iR = 0;
        String strC0 = null;
        LeaderboardPlanTypeNetworkEntity leaderboardPlanTypeNetworkEntity = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else if (iG0 == 0) {
                iR = rt1VarN.R(serialDescriptor, 0);
                i |= 1;
            } else if (iG0 == 1) {
                strC0 = rt1VarN.c0(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iG0 != 2) {
                    ll.a(iG0);
                    return null;
                }
                leaderboardPlanTypeNetworkEntity = (LeaderboardPlanTypeNetworkEntity) rt1VarN.J(serialDescriptor, 2, ss5VarArr[2].getValue(), leaderboardPlanTypeNetworkEntity);
                i |= 4;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new LeaderboardPlanNetworkEntity(i, iR, strC0, leaderboardPlanTypeNetworkEntity);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, LeaderboardPlanNetworkEntity leaderboardPlanNetworkEntity) {
        encoder.getClass();
        leaderboardPlanNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = LeaderboardPlanNetworkEntity.d;
        st1VarN.g(0, leaderboardPlanNetworkEntity.a, serialDescriptor);
        st1VarN.p(serialDescriptor, 1, leaderboardPlanNetworkEntity.b);
        st1VarN.q(serialDescriptor, 2, ss5VarArr[2].getValue(), leaderboardPlanNetworkEntity.c);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
