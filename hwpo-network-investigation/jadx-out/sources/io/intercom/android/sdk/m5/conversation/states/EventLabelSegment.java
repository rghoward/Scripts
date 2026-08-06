package io.intercom.android.sdk.m5.conversation.states;

import defpackage.qq2;
import defpackage.xj5;
import io.intercom.android.sdk.models.Weight;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class EventLabelSegment {
    public static final int $stable = 0;
    private final String text;
    private final Weight weight;

    public EventLabelSegment(String str, Weight weight) {
        str.getClass();
        this.text = str;
        this.weight = weight;
    }

    public static /* synthetic */ EventLabelSegment copy$default(EventLabelSegment eventLabelSegment, String str, Weight weight, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventLabelSegment.text;
        }
        if ((i & 2) != 0) {
            weight = eventLabelSegment.weight;
        }
        return eventLabelSegment.copy(str, weight);
    }

    public final String component1() {
        return this.text;
    }

    public final Weight component2() {
        return this.weight;
    }

    public final EventLabelSegment copy(String str, Weight weight) {
        str.getClass();
        return new EventLabelSegment(str, weight);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventLabelSegment)) {
            return false;
        }
        EventLabelSegment eventLabelSegment = (EventLabelSegment) obj;
        return xj5.a(this.text, eventLabelSegment.text) && this.weight == eventLabelSegment.weight;
    }

    public final String getText() {
        return this.text;
    }

    public final Weight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        Weight weight = this.weight;
        return iHashCode + (weight == null ? 0 : weight.hashCode());
    }

    public String toString() {
        return "EventLabelSegment(text=" + this.text + ", weight=" + this.weight + ')';
    }

    public /* synthetic */ EventLabelSegment(String str, Weight weight, int i, qq2 qq2Var) {
        this(str, (i & 2) != 0 ? null : weight);
    }
}
