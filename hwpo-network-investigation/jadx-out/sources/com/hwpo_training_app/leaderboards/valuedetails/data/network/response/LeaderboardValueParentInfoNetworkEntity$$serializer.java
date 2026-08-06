package com.hwpo_training_app.leaderboards.valuedetails.data.network.response;

import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardPlanNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardPlanNetworkEntity$$serializer;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardSectionNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardSectionNetworkEntity$$serializer;
import defpackage.gk4;
import defpackage.gy2;
import defpackage.ig5;
import defpackage.ll;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
import defpackage.ry0;
import defpackage.st1;
import defpackage.ue6;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@gy2
public final /* synthetic */ class LeaderboardValueParentInfoNetworkEntity$$serializer implements gk4<LeaderboardValueParentInfoNetworkEntity> {
    public static final LeaderboardValueParentInfoNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LeaderboardValueParentInfoNetworkEntity$$serializer leaderboardValueParentInfoNetworkEntity$$serializer = new LeaderboardValueParentInfoNetworkEntity$$serializer();
        INSTANCE = leaderboardValueParentInfoNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.leaderboards.valuedetails.data.network.response.LeaderboardValueParentInfoNetworkEntity", leaderboardValueParentInfoNetworkEntity$$serializer, 4);
        o48Var.k("id", false);
        o48Var.k("plan", true);
        o48Var.k("section", true);
        o48Var.k("updated_at", false);
        descriptor = o48Var;
    }

    private LeaderboardValueParentInfoNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{ig5.a, ry0.a(LeaderboardPlanNetworkEntity$$serializer.INSTANCE), ry0.a(LeaderboardSectionNetworkEntity$$serializer.INSTANCE), ue6.a};
    }

    @Override // defpackage.sy2
    public final LeaderboardValueParentInfoNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        int i = 0;
        int iR = 0;
        LeaderboardPlanNetworkEntity leaderboardPlanNetworkEntity = null;
        LeaderboardSectionNetworkEntity leaderboardSectionNetworkEntity = null;
        long jG = 0;
        boolean z = true;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else if (iG0 == 0) {
                iR = rt1VarN.R(serialDescriptor, 0);
                i |= 1;
            } else if (iG0 == 1) {
                leaderboardPlanNetworkEntity = (LeaderboardPlanNetworkEntity) rt1VarN.L(serialDescriptor, 1, LeaderboardPlanNetworkEntity$$serializer.INSTANCE, leaderboardPlanNetworkEntity);
                i |= 2;
            } else if (iG0 == 2) {
                leaderboardSectionNetworkEntity = (LeaderboardSectionNetworkEntity) rt1VarN.L(serialDescriptor, 2, LeaderboardSectionNetworkEntity$$serializer.INSTANCE, leaderboardSectionNetworkEntity);
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
        return new LeaderboardValueParentInfoNetworkEntity(i, iR, leaderboardPlanNetworkEntity, leaderboardSectionNetworkEntity, jG);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, LeaderboardValueParentInfoNetworkEntity leaderboardValueParentInfoNetworkEntity) {
        encoder.getClass();
        leaderboardValueParentInfoNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        int i = leaderboardValueParentInfoNetworkEntity.a;
        LeaderboardSectionNetworkEntity leaderboardSectionNetworkEntity = leaderboardValueParentInfoNetworkEntity.c;
        LeaderboardPlanNetworkEntity leaderboardPlanNetworkEntity = leaderboardValueParentInfoNetworkEntity.b;
        st1VarN.g(0, i, serialDescriptor);
        if (st1VarN.C(serialDescriptor) || leaderboardPlanNetworkEntity != null) {
            st1VarN.z(serialDescriptor, 1, LeaderboardPlanNetworkEntity$$serializer.INSTANCE, leaderboardPlanNetworkEntity);
        }
        if (st1VarN.C(serialDescriptor) || leaderboardSectionNetworkEntity != null) {
            st1VarN.z(serialDescriptor, 2, LeaderboardSectionNetworkEntity$$serializer.INSTANCE, leaderboardSectionNetworkEntity);
        }
        st1VarN.B(serialDescriptor, 3, leaderboardValueParentInfoNetworkEntity.d);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
