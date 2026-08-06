package com.hwpo_training_app.affiliated_gym.data.entity.response;

import com.hwpo_training_app.affiliated_gym.data.entity.GymFilterCityNetworkEntity;
import com.hwpo_training_app.core.data.model.pagination.PagingPaginationNetworkEntity;
import defpackage.hl3;
import defpackage.hv5;
import defpackage.j26;
import defpackage.rd9;
import defpackage.ss5;
import defpackage.xj5;
import defpackage.zp4;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class GymFilterCitiesResponse {
    public static final Companion Companion = new Companion();
    public static final ss5<KSerializer<Object>>[] c = {hv5.c(j26.t, new zp4(0)), null};
    public final List<GymFilterCityNetworkEntity> a;
    public final PagingPaginationNetworkEntity b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<GymFilterCitiesResponse> serializer() {
            return GymFilterCitiesResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GymFilterCitiesResponse(int i, List list, PagingPaginationNetworkEntity pagingPaginationNetworkEntity) {
        if (3 != (i & 3)) {
            hl3.b(i, 3, GymFilterCitiesResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = pagingPaginationNetworkEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GymFilterCitiesResponse)) {
            return false;
        }
        GymFilterCitiesResponse gymFilterCitiesResponse = (GymFilterCitiesResponse) obj;
        return xj5.a(this.a, gymFilterCitiesResponse.a) && xj5.a(this.b, gymFilterCitiesResponse.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GymFilterCitiesResponse(items=" + this.a + ", pagination=" + this.b + ")";
    }
}
