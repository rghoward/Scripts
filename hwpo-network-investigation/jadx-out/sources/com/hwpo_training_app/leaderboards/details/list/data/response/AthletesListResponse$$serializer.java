package com.hwpo_training_app.leaderboards.details.list.data.response;

import com.hwpo_training_app.core.data.model.pagination.PagingPaginationNetworkEntity;
import com.hwpo_training_app.core.data.model.pagination.PagingPaginationNetworkEntity$$serializer;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardTopValueNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardTopValueNetworkEntity$$serializer;
import defpackage.gk4;
import defpackage.gy2;
import defpackage.is0;
import defpackage.ll;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
import defpackage.ry0;
import defpackage.ss5;
import defpackage.st1;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@gy2
public final /* synthetic */ class AthletesListResponse$$serializer implements gk4<AthletesListResponse> {
    public static final AthletesListResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AthletesListResponse$$serializer athletesListResponse$$serializer = new AthletesListResponse$$serializer();
        INSTANCE = athletesListResponse$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.leaderboards.details.list.data.response.AthletesListResponse", athletesListResponse$$serializer, 4);
        o48Var.k("items", false);
        o48Var.k("my_value", true);
        o48Var.k("value_submitted", true);
        o48Var.k("pagination", false);
        descriptor = o48Var;
    }

    private AthletesListResponse$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{AthletesListResponse.e[0].getValue(), ry0.a(LeaderboardTopValueNetworkEntity$$serializer.INSTANCE), ry0.a(is0.a), PagingPaginationNetworkEntity$$serializer.INSTANCE};
    }

    @Override // defpackage.sy2
    public final AthletesListResponse deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = AthletesListResponse.e;
        boolean z = true;
        int i = 0;
        List list = null;
        LeaderboardTopValueNetworkEntity leaderboardTopValueNetworkEntity = null;
        Boolean bool = null;
        PagingPaginationNetworkEntity pagingPaginationNetworkEntity = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else if (iG0 == 0) {
                list = (List) rt1VarN.J(serialDescriptor, 0, ss5VarArr[0].getValue(), list);
                i |= 1;
            } else if (iG0 == 1) {
                leaderboardTopValueNetworkEntity = (LeaderboardTopValueNetworkEntity) rt1VarN.L(serialDescriptor, 1, LeaderboardTopValueNetworkEntity$$serializer.INSTANCE, leaderboardTopValueNetworkEntity);
                i |= 2;
            } else if (iG0 == 2) {
                bool = (Boolean) rt1VarN.L(serialDescriptor, 2, is0.a, bool);
                i |= 4;
            } else {
                if (iG0 != 3) {
                    ll.a(iG0);
                    return null;
                }
                pagingPaginationNetworkEntity = (PagingPaginationNetworkEntity) rt1VarN.J(serialDescriptor, 3, PagingPaginationNetworkEntity$$serializer.INSTANCE, pagingPaginationNetworkEntity);
                i |= 8;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new AthletesListResponse(i, list, leaderboardTopValueNetworkEntity, bool, pagingPaginationNetworkEntity);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, AthletesListResponse athletesListResponse) {
        encoder.getClass();
        athletesListResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        KSerializer<Object> value = AthletesListResponse.e[0].getValue();
        List<LeaderboardTopValueNetworkEntity> list = athletesListResponse.a;
        Boolean bool = athletesListResponse.c;
        LeaderboardTopValueNetworkEntity leaderboardTopValueNetworkEntity = athletesListResponse.b;
        st1VarN.q(serialDescriptor, 0, value, list);
        if (st1VarN.C(serialDescriptor) || leaderboardTopValueNetworkEntity != null) {
            st1VarN.z(serialDescriptor, 1, LeaderboardTopValueNetworkEntity$$serializer.INSTANCE, leaderboardTopValueNetworkEntity);
        }
        if (st1VarN.C(serialDescriptor) || bool != null) {
            st1VarN.z(serialDescriptor, 2, is0.a, bool);
        }
        st1VarN.q(serialDescriptor, 3, PagingPaginationNetworkEntity$$serializer.INSTANCE, athletesListResponse.d);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
