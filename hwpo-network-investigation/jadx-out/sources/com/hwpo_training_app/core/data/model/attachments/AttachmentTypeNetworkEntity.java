package com.hwpo_training_app.core.data.model.attachments;

import defpackage.f93;
import defpackage.hv5;
import defpackage.j26;
import defpackage.rd9;
import defpackage.ss5;
import defpackage.u60;
import defpackage.v60;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public enum AttachmentTypeNetworkEntity implements f93<u60> {
    /* JADX INFO: Fake field, exist only in values array */
    EF2 { // from class: com.hwpo_training_app.core.data.model.attachments.AttachmentTypeNetworkEntity.d
        @Override // defpackage.f93
        public final u60 a() {
            return u60.t;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF7 { // from class: com.hwpo_training_app.core.data.model.attachments.AttachmentTypeNetworkEntity.c
        @Override // defpackage.f93
        public final u60 a() {
            return u60.u;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF12 { // from class: com.hwpo_training_app.core.data.model.attachments.AttachmentTypeNetworkEntity.a
        @Override // defpackage.f93
        public final u60 a() {
            return u60.v;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF17 { // from class: com.hwpo_training_app.core.data.model.attachments.AttachmentTypeNetworkEntity.b
        @Override // defpackage.f93
        public final u60 a() {
            return u60.w;
        }
    };

    public static final Companion Companion = new Companion();
    public static final ss5<KSerializer<Object>> t = hv5.c(j26.t, new v60());

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<AttachmentTypeNetworkEntity> serializer() {
            return (KSerializer) AttachmentTypeNetworkEntity.t.getValue();
        }
    }

    AttachmentTypeNetworkEntity() {
        throw null;
    }
}
