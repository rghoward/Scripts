package com.hwpo_training_app.core.data.model.schedule;

import defpackage.f93;
import defpackage.hv5;
import defpackage.j26;
import defpackage.o89;
import defpackage.rd9;
import defpackage.ss5;
import defpackage.w32;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public enum SectionKindNetworkEntity implements f93<o89> {
    /* JADX INFO: Fake field, exist only in values array */
    EF2 { // from class: com.hwpo_training_app.core.data.model.schedule.SectionKindNetworkEntity.f
        @Override // defpackage.f93
        public final o89 a() {
            return o89.t;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF7 { // from class: com.hwpo_training_app.core.data.model.schedule.SectionKindNetworkEntity.b
        @Override // defpackage.f93
        public final o89 a() {
            return o89.u;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF12 { // from class: com.hwpo_training_app.core.data.model.schedule.SectionKindNetworkEntity.e
        @Override // defpackage.f93
        public final o89 a() {
            return o89.v;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF17 { // from class: com.hwpo_training_app.core.data.model.schedule.SectionKindNetworkEntity.a
        @Override // defpackage.f93
        public final o89 a() {
            return o89.w;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF22 { // from class: com.hwpo_training_app.core.data.model.schedule.SectionKindNetworkEntity.d
        @Override // defpackage.f93
        public final o89 a() {
            return o89.x;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF27 { // from class: com.hwpo_training_app.core.data.model.schedule.SectionKindNetworkEntity.c
        @Override // defpackage.f93
        public final o89 a() {
            return o89.y;
        }
    };

    public static final Companion Companion = new Companion();
    public static final ss5<KSerializer<Object>> t = hv5.c(j26.t, new w32(1));

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<SectionKindNetworkEntity> serializer() {
            return (KSerializer) SectionKindNetworkEntity.t.getValue();
        }
    }

    SectionKindNetworkEntity() {
        throw null;
    }
}
