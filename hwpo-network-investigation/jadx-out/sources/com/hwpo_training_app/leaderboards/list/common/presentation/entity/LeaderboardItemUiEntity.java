package com.hwpo_training_app.leaderboards.list.common.presentation.entity;

import defpackage.av;
import defpackage.il;
import defpackage.ru3;
import defpackage.ux1;
import defpackage.xj5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class LeaderboardItemUiEntity {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class LeaderboardProgramUiEntity extends LeaderboardItemUiEntity {
        public final int a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final ArrayList h;
        public final Integer i;
        public final Integer j;

        public LeaderboardProgramUiEntity(int i, String str, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList, Integer num, Integer num2) {
            super(0);
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = arrayList;
            this.i = num;
            this.j = num2;
        }

        @Override // com.hwpo_training_app.leaderboards.list.common.presentation.entity.LeaderboardItemUiEntity
        public final String a() {
            return this.e;
        }

        @Override // com.hwpo_training_app.leaderboards.list.common.presentation.entity.LeaderboardItemUiEntity
        public final String b() {
            return this.d;
        }

        @Override // com.hwpo_training_app.leaderboards.list.common.presentation.entity.LeaderboardItemUiEntity
        public final int c() {
            return this.a;
        }

        @Override // com.hwpo_training_app.leaderboards.list.common.presentation.entity.LeaderboardItemUiEntity
        public final String d() {
            return this.f;
        }

        @Override // com.hwpo_training_app.leaderboards.list.common.presentation.entity.LeaderboardItemUiEntity
        public final List<TopValueUiEntity> e() {
            return this.h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LeaderboardProgramUiEntity)) {
                return false;
            }
            LeaderboardProgramUiEntity leaderboardProgramUiEntity = (LeaderboardProgramUiEntity) obj;
            return this.a == leaderboardProgramUiEntity.a && xj5.a(this.b, leaderboardProgramUiEntity.b) && xj5.a(this.c, leaderboardProgramUiEntity.c) && xj5.a(this.d, leaderboardProgramUiEntity.d) && xj5.a(this.e, leaderboardProgramUiEntity.e) && xj5.a(this.f, leaderboardProgramUiEntity.f) && xj5.a(this.g, leaderboardProgramUiEntity.g) && xj5.a(this.h, leaderboardProgramUiEntity.h) && xj5.a(this.i, leaderboardProgramUiEntity.i) && xj5.a(this.j, leaderboardProgramUiEntity.j);
        }

        public final int hashCode() {
            int iC = ru3.c(Integer.hashCode(this.a) * 31, 31, this.b);
            String str = this.c;
            int iC2 = ru3.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
            String str2 = this.e;
            int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.g;
            int iHashCode3 = (this.h.hashCode() + ((iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
            Integer num = this.i;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.j;
            return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbA = il.a("LeaderboardProgramUiEntity(id=", ", title=", this.b, ", description=", this.a);
            ux1.b(sbA, this.c, ", detailsTitle=", this.d, ", detailsDescription=");
            ux1.b(sbA, this.e, ", lastUpdatedText=", this.f, ", commentsCountText=");
            sbA.append(this.g);
            sbA.append(", topValues=");
            sbA.append(this.h);
            sbA.append(", parentProgramId=");
            sbA.append(this.i);
            sbA.append(", parentSectionId=");
            sbA.append(this.j);
            sbA.append(")");
            return sbA.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class LeaderboardProgramsSearchResultUiEntity extends LeaderboardItemUiEntity {
        public final int a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final ArrayList f;
        public final String g;

        public LeaderboardProgramsSearchResultUiEntity(int i, String str, String str2, String str3, String str4, ArrayList arrayList, String str5) {
            super(0);
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = arrayList;
            this.g = str5;
        }

        @Override // com.hwpo_training_app.leaderboards.list.common.presentation.entity.LeaderboardItemUiEntity
        public final String a() {
            return this.e;
        }

        @Override // com.hwpo_training_app.leaderboards.list.common.presentation.entity.LeaderboardItemUiEntity
        public final String b() {
            return this.d;
        }

        @Override // com.hwpo_training_app.leaderboards.list.common.presentation.entity.LeaderboardItemUiEntity
        public final int c() {
            return this.a;
        }

        @Override // com.hwpo_training_app.leaderboards.list.common.presentation.entity.LeaderboardItemUiEntity
        public final String d() {
            return this.g;
        }

        @Override // com.hwpo_training_app.leaderboards.list.common.presentation.entity.LeaderboardItemUiEntity
        public final List<TopValueUiEntity> e() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LeaderboardProgramsSearchResultUiEntity)) {
                return false;
            }
            LeaderboardProgramsSearchResultUiEntity leaderboardProgramsSearchResultUiEntity = (LeaderboardProgramsSearchResultUiEntity) obj;
            return this.a == leaderboardProgramsSearchResultUiEntity.a && xj5.a(this.b, leaderboardProgramsSearchResultUiEntity.b) && xj5.a(this.c, leaderboardProgramsSearchResultUiEntity.c) && xj5.a(this.d, leaderboardProgramsSearchResultUiEntity.d) && xj5.a(this.e, leaderboardProgramsSearchResultUiEntity.e) && xj5.a(this.f, leaderboardProgramsSearchResultUiEntity.f) && xj5.a(this.g, leaderboardProgramsSearchResultUiEntity.g);
        }

        public final int hashCode() {
            int iC = ru3.c(Integer.hashCode(this.a) * 31, 31, this.b);
            String str = this.c;
            int iC2 = ru3.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
            String str2 = this.e;
            int iHashCode = (this.f.hashCode() + ((iC2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.g;
            return iHashCode + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbA = il.a("LeaderboardProgramsSearchResultUiEntity(id=", ", title=", this.b, ", description=", this.a);
            ux1.b(sbA, this.c, ", detailsTitle=", this.d, ", detailsDescription=");
            sbA.append(this.e);
            sbA.append(", topValues=");
            sbA.append(this.f);
            sbA.append(", lastUpdatedText=");
            return av.a(sbA, this.g, ")");
        }
    }

    public /* synthetic */ LeaderboardItemUiEntity(int i) {
        this();
    }

    public abstract String a();

    public abstract String b();

    public abstract int c();

    public abstract String d();

    public abstract List<TopValueUiEntity> e();

    private LeaderboardItemUiEntity() {
    }
}
