package io.intercom.android.sdk.carousel;

import androidx.fragment.app.f;
import androidx.fragment.app.l;
import defpackage.jf4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class CarouselScreenPagerAdapter extends jf4 {
    private List<CarouselScreenFragment> fragments;

    public CarouselScreenPagerAdapter(l lVar, List<CarouselScreenFragment> list) {
        super(lVar);
        this.fragments = list;
    }

    @Override // defpackage.qp7
    public int getCount() {
        return this.fragments.size();
    }

    @Override // defpackage.jf4
    public f getItem(int i) {
        return this.fragments.get(i);
    }
}
