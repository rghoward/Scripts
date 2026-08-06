package io.intercom.android.sdk.utilities;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.utilities.commons.TimeProvider;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class TrackingLinkMovementMethod extends LinkMovementMethod {
    private boolean longClickActive = false;
    private boolean longClickPerformed = false;
    private long startClickTime;

    private int getPosition(MotionEvent motionEvent, TextView textView) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int totalPaddingLeft = x - textView.getTotalPaddingLeft();
        int totalPaddingTop = y - textView.getTotalPaddingTop();
        int scrollX = textView.getScrollX() + totalPaddingLeft;
        int scrollY = textView.getScrollY() + totalPaddingTop;
        Layout layout = textView.getLayout();
        return layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
    }

    private void performClick(ViewGroup viewGroup) {
        while (!viewGroup.performClick() && (viewGroup.getParent() instanceof ViewGroup)) {
            viewGroup = (ViewGroup) viewGroup.getParent();
        }
    }

    private void performLongClick(ViewGroup viewGroup) {
        while (!viewGroup.performLongClick() && (viewGroup.getParent() instanceof ViewGroup)) {
            viewGroup = (ViewGroup) viewGroup.getParent();
        }
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int position = getPosition(motionEvent, textView);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(position, position, URLSpan.class);
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 0) {
            this.startClickTime = TimeProvider.SYSTEM.currentTimeMillis();
            if (!this.longClickActive) {
                this.longClickActive = true;
            }
            if (uRLSpanArr.length != 0) {
                Selection.setSelection(spannable, spannable.getSpanStart(uRLSpanArr[0]), spannable.getSpanEnd(uRLSpanArr[0]));
            }
        } else {
            if (action == 1) {
                this.longClickActive = false;
                if (this.longClickPerformed) {
                    z = false;
                } else if (uRLSpanArr.length != 0) {
                    LinkOpener.handleUrl(uRLSpanArr[0].getURL(), textView.getContext(), Injector.get().getApi());
                } else {
                    Selection.removeSelection(spannable);
                    performClick((ViewGroup) textView.getParent());
                }
                this.longClickPerformed = false;
                return z;
            }
            if (action == 2 && this.longClickActive && TimeProvider.SYSTEM.currentTimeMillis() - this.startClickTime >= ViewConfiguration.getLongPressTimeout()) {
                this.longClickActive = false;
                performLongClick((ViewGroup) textView.getParent());
                this.longClickPerformed = true;
                return true;
            }
        }
        return false;
    }
}
