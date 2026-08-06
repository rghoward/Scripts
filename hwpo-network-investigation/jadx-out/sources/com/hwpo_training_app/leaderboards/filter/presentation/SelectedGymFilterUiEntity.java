package com.hwpo_training_app.leaderboards.filter.presentation;

import defpackage.av;
import defpackage.cq2;
import defpackage.os2;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class SelectedGymFilterUiEntity {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Affiliated extends SelectedGymFilterUiEntity {
        public final boolean a;
        public final int b;
        public final String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Affiliated(int i, String str, boolean z) {
            super(0);
            str.getClass();
            this.a = z;
            this.b = i;
            this.c = str;
        }

        @Override // com.hwpo_training_app.leaderboards.filter.presentation.SelectedGymFilterUiEntity
        public final boolean a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Affiliated)) {
                return false;
            }
            Affiliated affiliated = (Affiliated) obj;
            return this.a == affiliated.a && this.b == affiliated.b && xj5.a(this.c, affiliated.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + os2.a(this.b, Boolean.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Affiliated(ableToChooseMyGym=");
            sb.append(this.a);
            sb.append(", id=");
            sb.append(this.b);
            sb.append(", name=");
            return av.a(sb, this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class MyGym extends SelectedGymFilterUiEntity {
        public static final MyGym a = new MyGym();
        public static final boolean b = true;

        private MyGym() {
            super(0);
        }

        @Override // com.hwpo_training_app.leaderboards.filter.presentation.SelectedGymFilterUiEntity
        public final boolean a() {
            return b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class None extends SelectedGymFilterUiEntity {
        public final boolean a;

        public None(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // com.hwpo_training_app.leaderboards.filter.presentation.SelectedGymFilterUiEntity
        public final boolean a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof None) && this.a == ((None) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return cq2.a("None(ableToChooseMyGym=", ")", this.a);
        }
    }

    public /* synthetic */ SelectedGymFilterUiEntity(int i) {
        this();
    }

    public abstract boolean a();

    private SelectedGymFilterUiEntity() {
    }
}
