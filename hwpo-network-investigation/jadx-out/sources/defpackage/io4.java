package defpackage;

import java.text.BreakIterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class io4 extends ln4 {
    public final BreakIterator x;

    public io4(CharSequence charSequence) {
        super(11);
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.x = characterInstance;
    }

    @Override // defpackage.ln4
    public final int R0(int i) {
        return this.x.following(i);
    }

    @Override // defpackage.ln4
    public final int V0(int i) {
        return this.x.preceding(i);
    }
}
