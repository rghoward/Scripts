package com.hwpo_training_app.tracking.data.entity;

import com.hwpo_training_app.core.data.model.attachments.SectionAttachmentNetworkEntity;
import defpackage.al;
import defpackage.f93;
import defpackage.g93;
import defpackage.hl3;
import defpackage.ho2;
import defpackage.hv5;
import defpackage.j26;
import defpackage.l59;
import defpackage.rc6;
import defpackage.rd9;
import defpackage.ss5;
import defpackage.tc6;
import defpackage.xj5;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class ScoreInfoNetworkEntity implements f93<l59> {
    public static final Companion Companion = new Companion();
    public static final ss5<KSerializer<Object>>[] y;
    public final int t;
    public final List<String> u;
    public final String v;
    public final long w;
    public final List<SectionAttachmentNetworkEntity> x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<ScoreInfoNetworkEntity> serializer() {
            return ScoreInfoNetworkEntity$$serializer.INSTANCE;
        }
    }

    static {
        rc6 rc6Var = new rc6(1);
        j26 j26Var = j26.t;
        y = new ss5[]{null, hv5.c(j26Var, rc6Var), null, null, hv5.c(j26Var, new tc6(1))};
    }

    public /* synthetic */ ScoreInfoNetworkEntity(int i, int i2, List list, String str, long j, List list2) {
        if (27 != (i & 27)) {
            hl3.b(i, 27, ScoreInfoNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.t = i2;
        this.u = list;
        if ((i & 4) == 0) {
            this.v = null;
        } else {
            this.v = str;
        }
        this.w = j;
        this.x = list2;
    }

    @Override // defpackage.f93
    public final l59 a() {
        return new l59(this.t, this.u, this.v, this.w, g93.a(this.x));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScoreInfoNetworkEntity)) {
            return false;
        }
        ScoreInfoNetworkEntity scoreInfoNetworkEntity = (ScoreInfoNetworkEntity) obj;
        return this.t == scoreInfoNetworkEntity.t && xj5.a(this.u, scoreInfoNetworkEntity.u) && xj5.a(this.v, scoreInfoNetworkEntity.v) && this.w == scoreInfoNetworkEntity.w && xj5.a(this.x, scoreInfoNetworkEntity.x);
    }

    public final int hashCode() {
        int iA = ho2.a(Integer.hashCode(this.t) * 31, 31, this.u);
        String str = this.v;
        return this.x.hashCode() + al.c(this.w, (iA + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "ScoreInfoNetworkEntity(id=" + this.t + ", tags=" + this.u + ", description=" + this.v + ", updatedAt=" + this.w + ", attachments=" + this.x + ")";
    }
}
