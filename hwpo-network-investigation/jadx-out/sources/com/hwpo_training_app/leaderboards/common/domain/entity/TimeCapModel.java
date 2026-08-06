package com.hwpo_training_app.leaderboards.common.domain.entity;

import defpackage.i34;
import defpackage.os2;
import defpackage.pk;
import defpackage.u43;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class TimeCapModel {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class RoundReps extends TimeCapModel {
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
            return i34.b(this.c, ")", u43.b("RoundReps(rounds=", ", reps=", ", seconds=", this.a, this.b));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Time extends TimeCapModel {
        public final int a;

        public Time(int i) {
            super(0);
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Time) && this.a == ((Time) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pk.d(this.a, "Time(seconds=", ")");
        }
    }

    public /* synthetic */ TimeCapModel(int i) {
        this();
    }

    private TimeCapModel() {
    }
}
