package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import defpackage.qq2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
final class WaveformBuffer {
    private int capacity;
    private WaveformElement[] elements;
    private int head;
    private int size;

    public WaveformBuffer(int i) {
        this.capacity = i;
        WaveformElement[] waveformElementArr = new WaveformElement[i];
        for (int i2 = 0; i2 < i; i2++) {
            waveformElementArr[i2] = null;
        }
        this.elements = waveformElementArr;
    }

    public final void addElement(WaveformElement waveformElement) {
        waveformElement.getClass();
        WaveformElement[] waveformElementArr = this.elements;
        int i = this.head;
        waveformElementArr[i] = waveformElement;
        int i2 = this.capacity;
        this.head = (i + 1) % i2;
        int i3 = this.size;
        if (i3 < i2) {
            this.size = i3 + 1;
        }
    }

    public final void cleanupOldElements(long j, long j2) {
        int i = this.head;
        int i2 = this.size;
        int i3 = this.capacity;
        int i4 = ((i - i2) + i3) % i3;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (this.head - this.size) + i6;
            int i8 = this.capacity;
            int i9 = (i7 + i8) % i8;
            WaveformElement waveformElement = this.elements[i9];
            if (waveformElement == null || j - waveformElement.getTimestamp() > j2) {
                this.elements[i9] = null;
            } else {
                if (i9 != i4) {
                    WaveformElement[] waveformElementArr = this.elements;
                    waveformElementArr[i4] = waveformElement;
                    waveformElementArr[i9] = null;
                }
                i4 = (i4 + 1) % this.capacity;
                i5++;
            }
        }
        this.size = i5;
        this.head = i4;
    }

    public final List<WaveformElement> getAllElements() {
        ArrayList arrayList = new ArrayList();
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = (this.head - this.size) + i2;
            int i4 = this.capacity;
            WaveformElement waveformElement = this.elements[(i3 + i4) % i4];
            if (waveformElement != null) {
                arrayList.add(waveformElement);
            }
        }
        return arrayList;
    }

    public final int getCurrentSize() {
        return this.size;
    }

    public final void resizeBuffer(int i) {
        int i2 = this.capacity;
        if (i == i2) {
            return;
        }
        WaveformElement[] waveformElementArr = this.elements;
        int i3 = this.head;
        int i4 = this.size;
        this.capacity = i;
        WaveformElement[] waveformElementArr2 = new WaveformElement[i];
        for (int i5 = 0; i5 < i; i5++) {
            waveformElementArr2[i5] = null;
        }
        this.elements = waveformElementArr2;
        this.head = 0;
        this.size = 0;
        int iMin = Math.min(i4, i);
        for (int i6 = 0; i6 < iMin; i6++) {
            WaveformElement waveformElement = waveformElementArr[(((i3 - i4) + i6) + i2) % i2];
            if (waveformElement != null) {
                addElement(waveformElement);
            }
        }
    }

    public WaveformBuffer() {
        this(0, 1, null);
    }

    public /* synthetic */ WaveformBuffer(int i, int i2, qq2 qq2Var) {
        this((i2 & 1) != 0 ? 70 : i);
    }
}
