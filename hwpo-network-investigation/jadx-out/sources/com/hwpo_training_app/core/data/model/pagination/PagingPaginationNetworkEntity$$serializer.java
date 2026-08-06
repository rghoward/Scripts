package com.hwpo_training_app.core.data.model.pagination;

import defpackage.gk4;
import defpackage.gy2;
import defpackage.ig5;
import defpackage.ll;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
import defpackage.st1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@gy2
public final /* synthetic */ class PagingPaginationNetworkEntity$$serializer implements gk4<PagingPaginationNetworkEntity> {
    public static final PagingPaginationNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PagingPaginationNetworkEntity$$serializer pagingPaginationNetworkEntity$$serializer = new PagingPaginationNetworkEntity$$serializer();
        INSTANCE = pagingPaginationNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.core.data.model.pagination.PagingPaginationNetworkEntity", pagingPaginationNetworkEntity$$serializer, 4);
        o48Var.k("total_items", false);
        o48Var.k("total_pages", false);
        o48Var.k("current_page", false);
        o48Var.k("per_page", false);
        descriptor = o48Var;
    }

    private PagingPaginationNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        ig5 ig5Var = ig5.a;
        return new KSerializer[]{ig5Var, ig5Var, ig5Var, ig5Var};
    }

    @Override // defpackage.sy2
    public final PagingPaginationNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        int iR4 = 0;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else if (iG0 == 0) {
                iR = rt1VarN.R(serialDescriptor, 0);
                i |= 1;
            } else if (iG0 == 1) {
                iR2 = rt1VarN.R(serialDescriptor, 1);
                i |= 2;
            } else if (iG0 == 2) {
                iR3 = rt1VarN.R(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iG0 != 3) {
                    ll.a(iG0);
                    return null;
                }
                iR4 = rt1VarN.R(serialDescriptor, 3);
                i |= 8;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new PagingPaginationNetworkEntity(i, iR, iR2, iR3, iR4);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, PagingPaginationNetworkEntity pagingPaginationNetworkEntity) {
        encoder.getClass();
        pagingPaginationNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        st1VarN.g(0, pagingPaginationNetworkEntity.a, serialDescriptor);
        st1VarN.g(1, pagingPaginationNetworkEntity.b, serialDescriptor);
        st1VarN.g(2, pagingPaginationNetworkEntity.c, serialDescriptor);
        st1VarN.g(3, pagingPaginationNetworkEntity.d, serialDescriptor);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
