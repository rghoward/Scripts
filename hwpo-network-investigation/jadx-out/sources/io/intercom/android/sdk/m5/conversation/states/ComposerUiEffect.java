package io.intercom.android.sdk.m5.conversation.states;

import defpackage.qq2;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ComposerUiEffect {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ReportAiAnswer extends ComposerUiEffect {
        public static final int $stable = 0;
        public static final ReportAiAnswer INSTANCE = new ReportAiAnswer();

        private ReportAiAnswer() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class UpdateTranscribedText extends ComposerUiEffect {
        public static final int $stable = 0;
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateTranscribedText(String str) {
            super(null);
            str.getClass();
            this.text = str;
        }

        public static /* synthetic */ UpdateTranscribedText copy$default(UpdateTranscribedText updateTranscribedText, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = updateTranscribedText.text;
            }
            return updateTranscribedText.copy(str);
        }

        public final String component1() {
            return this.text;
        }

        public final UpdateTranscribedText copy(String str) {
            str.getClass();
            return new UpdateTranscribedText(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateTranscribedText) && xj5.a(this.text, ((UpdateTranscribedText) obj).text);
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return wu0.a(new StringBuilder("UpdateTranscribedText(text="), this.text, ')');
        }
    }

    public /* synthetic */ ComposerUiEffect(qq2 qq2Var) {
        this();
    }

    private ComposerUiEffect() {
    }
}
