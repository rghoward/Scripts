package com.hwpo_training_app.leaderboards.details.list.presentation.entity;

import com.hwpo_training_app.leaderboards.details.list.presentation.adapter.decorator.stickyfooter.StickyHeaderModel;
import defpackage.ao2;
import defpackage.e4;
import defpackage.fk;
import defpackage.il;
import defpackage.os2;
import defpackage.p23;
import defpackage.ru3;
import defpackage.uo2;
import defpackage.ux1;
import defpackage.xj5;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AthleteResultUiEntity {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class MyEmptyResultUiEntity extends AthleteResultUiEntity implements StickyHeaderModel {
        public final int a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MyEmptyResultUiEntity(int i, String str, String str2, String str3, String str4, String str5) {
            super(0);
            fk.b(str2, str4, str5);
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
        }

        @Override // com.hwpo_training_app.leaderboards.details.list.presentation.entity.AthleteResultUiEntity
        public final int a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MyEmptyResultUiEntity)) {
                return false;
            }
            MyEmptyResultUiEntity myEmptyResultUiEntity = (MyEmptyResultUiEntity) obj;
            return this.a == myEmptyResultUiEntity.a && xj5.a(this.b, myEmptyResultUiEntity.b) && xj5.a(this.c, myEmptyResultUiEntity.c) && xj5.a(this.d, myEmptyResultUiEntity.d) && xj5.a(this.e, myEmptyResultUiEntity.e) && xj5.a(this.f, myEmptyResultUiEntity.f);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.a) * 31;
            String str = this.b;
            return this.f.hashCode() + ru3.c(ru3.c(ru3.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sbA = il.a("MyEmptyResultUiEntity(id=", ", avatarUrl=", this.b, ", authorAvatarLetter=", this.a);
            ux1.b(sbA, this.c, ", position=", this.d, ", athleteName=");
            return ao2.a(sbA, this.e, ", countryYearsText=", this.f, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class MyFilledResultUiEntity extends AthleteResultUiEntity implements StickyHeaderModel {
        public final int a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final int g;
        public final int h;
        public final String i;
        public final boolean j;
        public final ArrayList k;
        public final boolean l;
        public final int m;
        public final int n;
        public final int o;
        public final int p;
        public final String q;
        public final int r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MyFilledResultUiEntity(int i, String str, String str2, String str3, String str4, String str5, int i2, int i3, String str6, boolean z, ArrayList arrayList, boolean z2, int i4, int i5, int i6, int i7, String str7, int i8) {
            super(0);
            fk.b(str2, str4, str5);
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = i2;
            this.h = i3;
            this.i = str6;
            this.j = z;
            this.k = arrayList;
            this.l = z2;
            this.m = i4;
            this.n = i5;
            this.o = i6;
            this.p = i7;
            this.q = str7;
            this.r = i8;
        }

        @Override // com.hwpo_training_app.leaderboards.details.list.presentation.entity.AthleteResultUiEntity
        public final int a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MyFilledResultUiEntity)) {
                return false;
            }
            MyFilledResultUiEntity myFilledResultUiEntity = (MyFilledResultUiEntity) obj;
            return this.a == myFilledResultUiEntity.a && xj5.a(this.b, myFilledResultUiEntity.b) && xj5.a(this.c, myFilledResultUiEntity.c) && xj5.a(this.d, myFilledResultUiEntity.d) && xj5.a(this.e, myFilledResultUiEntity.e) && xj5.a(this.f, myFilledResultUiEntity.f) && this.g == myFilledResultUiEntity.g && this.h == myFilledResultUiEntity.h && xj5.a(this.i, myFilledResultUiEntity.i) && this.j == myFilledResultUiEntity.j && xj5.a(this.k, myFilledResultUiEntity.k) && this.l == myFilledResultUiEntity.l && this.m == myFilledResultUiEntity.m && this.n == myFilledResultUiEntity.n && this.o == myFilledResultUiEntity.o && this.p == myFilledResultUiEntity.p && xj5.a(this.q, myFilledResultUiEntity.q) && this.r == myFilledResultUiEntity.r;
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.a) * 31;
            String str = this.b;
            int iA = os2.a(this.h, os2.a(this.g, ru3.c(ru3.c(ru3.c(ru3.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31);
            String str2 = this.i;
            int iA2 = os2.a(this.p, os2.a(this.o, os2.a(this.n, os2.a(this.m, uo2.a((this.k.hashCode() + uo2.a((iA + (str2 == null ? 0 : str2.hashCode())) * 31, this.j, 31)) * 31, this.l, 31), 31), 31), 31), 31);
            String str3 = this.q;
            return Integer.hashCode(this.r) + ((iA2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbA = il.a("MyFilledResultUiEntity(id=", ", avatarUrl=", this.b, ", authorAvatarLetter=", this.a);
            ux1.b(sbA, this.c, ", position=", this.d, ", athleteName=");
            ux1.b(sbA, this.e, ", countryYearsText=", this.f, ", positionBadgeColorRes=");
            p23.a(sbA, this.g, ", positionBadgeTextColorRes=", this.h, ", resultText=");
            sbA.append(this.i);
            sbA.append(", isMultipleScores=");
            sbA.append(this.j);
            sbA.append(", simpleAdditionalResults=");
            sbA.append(this.k);
            sbA.append(", isMyLike=");
            sbA.append(this.l);
            sbA.append(", attachmentsCount=");
            p23.a(sbA, this.m, ", attachmentTintColor=", this.n, ", commentsCount=");
            p23.a(sbA, this.o, ", commentsTintColor=", this.p, ", likesCountText=");
            sbA.append(this.q);
            sbA.append(", likeTintColor=");
            sbA.append(this.r);
            sbA.append(")");
            return sbA.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class OtherAthleteResultUiEntity extends AthleteResultUiEntity {
        public final int a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final int g;
        public final String h;
        public final boolean i;
        public final ArrayList j;
        public final boolean k;
        public final boolean l;
        public final int m;
        public final int n;
        public final int o;
        public final int p;
        public final String q;
        public final int r;
        public final int s;
        public final int t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OtherAthleteResultUiEntity(int i, String str, String str2, String str3, String str4, String str5, int i2, String str6, boolean z, ArrayList arrayList, boolean z2, boolean z3, int i3, int i4, int i5, int i6, String str7, int i7, int i8, int i9) {
            super(0);
            fk.b(str2, str4, str5);
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = i2;
            this.h = str6;
            this.i = z;
            this.j = arrayList;
            this.k = z2;
            this.l = z3;
            this.m = i3;
            this.n = i4;
            this.o = i5;
            this.p = i6;
            this.q = str7;
            this.r = i7;
            this.s = i8;
            this.t = i9;
        }

        @Override // com.hwpo_training_app.leaderboards.details.list.presentation.entity.AthleteResultUiEntity
        public final int a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OtherAthleteResultUiEntity)) {
                return false;
            }
            OtherAthleteResultUiEntity otherAthleteResultUiEntity = (OtherAthleteResultUiEntity) obj;
            return this.a == otherAthleteResultUiEntity.a && xj5.a(this.b, otherAthleteResultUiEntity.b) && xj5.a(this.c, otherAthleteResultUiEntity.c) && xj5.a(this.d, otherAthleteResultUiEntity.d) && xj5.a(this.e, otherAthleteResultUiEntity.e) && xj5.a(this.f, otherAthleteResultUiEntity.f) && this.g == otherAthleteResultUiEntity.g && xj5.a(this.h, otherAthleteResultUiEntity.h) && this.i == otherAthleteResultUiEntity.i && xj5.a(this.j, otherAthleteResultUiEntity.j) && this.k == otherAthleteResultUiEntity.k && this.l == otherAthleteResultUiEntity.l && this.m == otherAthleteResultUiEntity.m && this.n == otherAthleteResultUiEntity.n && this.o == otherAthleteResultUiEntity.o && this.p == otherAthleteResultUiEntity.p && xj5.a(this.q, otherAthleteResultUiEntity.q) && this.r == otherAthleteResultUiEntity.r && this.s == otherAthleteResultUiEntity.s && this.t == otherAthleteResultUiEntity.t;
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.a) * 31;
            String str = this.b;
            int iA = os2.a(this.g, ru3.c(ru3.c(ru3.c(ru3.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
            String str2 = this.h;
            int iA2 = os2.a(this.p, os2.a(this.o, os2.a(this.n, os2.a(this.m, uo2.a(uo2.a(uo2.a((this.j.hashCode() + uo2.a((iA + (str2 == null ? 0 : str2.hashCode())) * 31, this.i, 31)) * 31, this.k, 31), this.l, 31), false, 31), 31), 31), 31), 31);
            String str3 = this.q;
            return Integer.hashCode(this.t) + os2.a(this.s, os2.a(this.r, (iA2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sbA = il.a("OtherAthleteResultUiEntity(id=", ", avatarUrl=", this.b, ", authorAvatarLetter=", this.a);
            ux1.b(sbA, this.c, ", position=", this.d, ", athleteName=");
            ux1.b(sbA, this.e, ", countryYearsText=", this.f, ", positionBadgeColorRes=");
            sbA.append(this.g);
            sbA.append(", resultText=");
            sbA.append(this.h);
            sbA.append(", isMultipleScores=");
            sbA.append(this.i);
            sbA.append(", simpleAdditionalResults=");
            sbA.append(this.j);
            sbA.append(", isMyLike=");
            e4.a(sbA, this.k, ", isHidden=", this.l, ", canBeHidden=false, attachmentsCount=");
            p23.a(sbA, this.m, ", attachmentTintColor=", this.n, ", commentsCount=");
            p23.a(sbA, this.o, ", commentsTintColor=", this.p, ", likesCountText=");
            sbA.append(this.q);
            sbA.append(", likeTintColor=");
            sbA.append(this.r);
            sbA.append(", eyeIcon=");
            sbA.append(this.s);
            sbA.append(", eyeIconTint=");
            sbA.append(this.t);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public /* synthetic */ AthleteResultUiEntity(int i) {
        this();
    }

    public abstract int a();

    private AthleteResultUiEntity() {
    }
}
