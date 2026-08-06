package defpackage;

import java.text.CharacterIterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qa1 implements CharacterIterator {
    public final CharSequence t;
    public final int u;
    public int v = 0;

    public qa1(CharSequence charSequence, int i) {
        this.t = charSequence;
        this.u = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.v;
        if (i == this.u) {
            return (char) 65535;
        }
        return this.t.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.v = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.u;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.v;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.u;
        if (i == 0) {
            this.v = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.v = i2;
        return this.t.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.v + 1;
        this.v = i;
        int i2 = this.u;
        if (i < i2) {
            return this.t.charAt(i);
        }
        this.v = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.v;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.v = i2;
        return this.t.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.u || i < 0) {
            z90.a("invalid position");
            return (char) 0;
        }
        this.v = i;
        return current();
    }
}
