package com.hwpo_training_app.leaderboards.common.domain.entity;

import defpackage.i34;
import defpackage.os2;
import defpackage.ru3;
import defpackage.u43;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class LeaderboardScoreResultModel {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Other extends LeaderboardScoreResultModel {
        public final float a;
        public final String b;
        public final LeaderboardMeasureType c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Other(float f, String str, LeaderboardMeasureType leaderboardMeasureType) {
            super(0);
            str.getClass();
            this.a = f;
            this.b = str;
            this.c = leaderboardMeasureType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Other)) {
                return false;
            }
            Other other = (Other) obj;
            return Float.compare(this.a, other.a) == 0 && xj5.a(this.b, other.b) && this.c == other.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + ru3.c(Float.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            return "Other(value=" + this.a + ", symbol=" + this.b + ", measureType=" + this.c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class RoundReps extends LeaderboardScoreResultModel {
        public final int a;
        public final int b;
        public final int c;

        public RoundReps(int i, int i2, int i3) {
            super(0);
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RoundReps)) {
                return false;
            }
            RoundReps roundReps = (RoundReps) obj;
            return this.a == roundReps.a && this.b == roundReps.b && this.c == roundReps.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + os2.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            return i34.b(this.c, ")", u43.b("RoundReps(value=", ", rounds=", ", reps=", this.a, this.b));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class TimeCap extends LeaderboardScoreResultModel {
        public final TimeCapModel a;

        public TimeCap(TimeCapModel timeCapModel) {
            super(0);
            this.a = timeCapModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TimeCap) && xj5.a(this.a, ((TimeCap) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "TimeCap(timeCap=" + this.a + ")";
        }
    }

    public /* synthetic */ LeaderboardScoreResultModel(int i) {
        this();
    }

    private LeaderboardScoreResultModel() {
    }
}
