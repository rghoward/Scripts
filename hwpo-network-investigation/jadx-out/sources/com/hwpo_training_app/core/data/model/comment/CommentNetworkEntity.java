package com.hwpo_training_app.core.data.model.comment;

import com.hwpo_training_app.core.data.model.attachments.SectionAttachmentNetworkEntity;
import com.hwpo_training_app.core.data.model.user.OpponentNetworkEntity;
import defpackage.f93;
import defpackage.g93;
import defpackage.gk1;
import defpackage.hk1;
import defpackage.hl3;
import defpackage.hv5;
import defpackage.ik1;
import defpackage.j26;
import defpackage.rd9;
import defpackage.ss5;
import defpackage.xc9;
import defpackage.yk2;
import j$.time.LocalDateTime;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class CommentNetworkEntity implements f93<gk1> {
    public static final ss5<KSerializer<Object>>[] A;
    public static final Companion Companion = new Companion();
    public final long t;
    public final String u;
    public final Boolean v;
    public final long w;
    public final OpponentNetworkEntity x;
    public final List<SectionAttachmentNetworkEntity> y;
    public final List<CommentMentionNetworkEntity> z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<CommentNetworkEntity> serializer() {
            return CommentNetworkEntity$$serializer.INSTANCE;
        }
    }

    static {
        hk1 hk1Var = new hk1();
        j26 j26Var = j26.t;
        A = new ss5[]{null, null, null, null, null, hv5.c(j26Var, hk1Var), hv5.c(j26Var, new ik1(0))};
    }

    public /* synthetic */ CommentNetworkEntity(int i, long j, String str, Boolean bool, long j2, OpponentNetworkEntity opponentNetworkEntity, List list, List list2) {
        if (25 != (i & 25)) {
            hl3.b(i, 25, CommentNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.t = j;
        if ((i & 2) == 0) {
            this.u = null;
        } else {
            this.u = str;
        }
        if ((i & 4) == 0) {
            this.v = null;
        } else {
            this.v = bool;
        }
        this.w = j2;
        this.x = opponentNetworkEntity;
        if ((i & 32) == 0) {
            this.y = null;
        } else {
            this.y = list;
        }
        if ((i & 64) == 0) {
            this.z = null;
        } else {
            this.z = list2;
        }
    }

    @Override // defpackage.f93
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final gk1 a() {
        Boolean bool = this.v;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        LocalDateTime localDateTimeQ = yk2.q(this.w);
        localDateTimeQ.getClass();
        return new gk1(this.t, null, this.u, false, zBooleanValue, localDateTimeQ, this.x.a(), g93.a(this.z), g93.a(this.y), xc9.u);
    }
}
