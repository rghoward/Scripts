package com.hwpo_training_app.leaderboards.list.common.data.network.response;

import com.hwpo_training_app.core.data.model.pagination.PagingPaginationNetworkEntity;
import com.hwpo_training_app.core.data.model.pagination.PagingPaginationNetworkEntity$$serializer;
import defpackage.gk4;
import defpackage.gy2;
import defpackage.ll;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
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
public final /* synthetic */ class LeaderboardsListResponse$$serializer implements gk4<LeaderboardsListResponse> {
    public static final LeaderboardsListResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LeaderboardsListResponse$$serializer leaderboardsListResponse$$serializer = new LeaderboardsListResponse$$serializer();
        INSTANCE = leaderboardsListResponse$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.leaderboards.list.common.data.network.response.LeaderboardsListResponse", leaderboardsListResponse$$serializer, 2);
        o48Var.k("items", false);
        o48Var.k("pagination", false);
        descriptor = o48Var;
    }

    private LeaderboardsListResponse$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{LeaderboardsListResponse.c[0].getValue(), PagingPaginationNetworkEntity$$serializer.INSTANCE};
    }

    @Override // defpackage.sy2
    public final LeaderboardsListResponse deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = LeaderboardsListResponse.c;
        boolean z = true;
        int i = 0;
        List list = null;
        PagingPaginationNetworkEntity pagingPaginationNetworkEntity = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else if (iG0 == 0) {
                list = (List) rt1VarN.J(serialDescriptor, 0, ss5VarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iG0 != 1) {
                    ll.a(iG0);
                    return null;
                }
                pagingPaginationNetworkEntity = (PagingPaginationNetworkEntity) rt1VarN.J(serialDescriptor, 1, PagingPaginationNetworkEntity$$serializer.INSTANCE, pagingPaginationNetworkEntity);
                i |= 2;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new LeaderboardsListResponse(i, list, pagingPaginationNetworkEntity);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, LeaderboardsListResponse leaderboardsListResponse) {
        encoder.getClass();
        leaderboardsListResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        st1VarN.q(serialDescriptor, 0, LeaderboardsListResponse.c[0].getValue(), leaderboardsListResponse.a);
        st1VarN.q(serialDescriptor, 1, PagingPaginationNetworkEntity$$serializer.INSTANCE, leaderboardsListResponse.b);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
