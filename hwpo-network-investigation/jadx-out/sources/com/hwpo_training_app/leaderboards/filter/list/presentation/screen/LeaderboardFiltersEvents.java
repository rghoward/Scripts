package com.hwpo_training_app.leaderboards.filter.list.presentation.screen;

import defpackage.ao3;
import defpackage.g2b;
import defpackage.gm3;
import defpackage.jp2;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class LeaderboardFiltersEvents extends gm3<g2b> {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class CloseDialog extends LeaderboardFiltersEvents {
        public static final CloseDialog b = new CloseDialog();

        private CloseDialog() {
            super(0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ShowCalendarFromDateEvent extends gm3<g2b> {
        public final long b;
        public final long c;

        public ShowCalendarFromDateEvent(long j, long j2) {
            super(g2b.a);
            this.b = j;
            this.c = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowCalendarFromDateEvent)) {
                return false;
            }
            ShowCalendarFromDateEvent showCalendarFromDateEvent = (ShowCalendarFromDateEvent) obj;
            return this.b == showCalendarFromDateEvent.b && this.c == showCalendarFromDateEvent.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
        }

        public final String toString() {
            return jp2.a(this.c, ")", ao3.b("ShowCalendarFromDateEvent(selectedDate=", this.b, ", maxDate="));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ShowCalendarToDateEvent extends gm3<g2b> {
        public final long b;
        public final Long c;
        public final long d;

        public ShowCalendarToDateEvent(long j, Long l, long j2) {
            super(g2b.a);
            this.b = j;
            this.c = l;
            this.d = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowCalendarToDateEvent)) {
                return false;
            }
            ShowCalendarToDateEvent showCalendarToDateEvent = (ShowCalendarToDateEvent) obj;
            return this.b == showCalendarToDateEvent.b && xj5.a(this.c, showCalendarToDateEvent.c) && this.d == showCalendarToDateEvent.d;
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.b) * 31;
            Long l = this.c;
            return Long.hashCode(this.d) + ((iHashCode + (l == null ? 0 : l.hashCode())) * 31);
        }

        public final String toString() {
            return "ShowCalendarToDateEvent(selectedDate=" + this.b + ", minDate=" + this.c + ", maxDate=" + this.d + ")";
        }
    }

    private LeaderboardFiltersEvents() {
        super(g2b.a);
    }

    public /* synthetic */ LeaderboardFiltersEvents(int i) {
        this();
    }
}
