/*
 * The MIT License
 *
 * Copyright 2012 Edwin Bratini.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.bgsystems.ireview.business.dao;

import com.bgsystems.ireview.business.dao.common.Dao;
import com.bgsystems.ireview.model.entities.AppUser;
import com.bgsystems.ireview.model.entities.Business;
import com.bgsystems.ireview.model.entities.Commodity;
import com.bgsystems.ireview.model.entities.Review;
import com.bgsystems.ireview.model.entities.ReviewUpdate;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Edwin Bratini
 */
@Local
public interface ReviewUpdateDao extends Dao<ReviewUpdate> {

    List<ReviewUpdate> findByReview(Review review);

    List<ReviewUpdate> findByUser(AppUser user);

    List<ReviewUpdate> findByCommodity(Commodity commodity);

    List<ReviewUpdate> findByBusiness(Business business);
}
