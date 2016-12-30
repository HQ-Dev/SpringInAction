package com.archy.spittr.data;

import com.archy.spittr.Spittle;

import java.util.List;


/**
 * Spittle Repository 可以通过它来查找 Spittle 数据
 * @ClassName: SpittleRepository
 * @Description:
 * @author Archy技术部-huang
 * @date 2016年12月30日 下午06:06:19
 */
public interface SpittleRepository {

    List<Spittle> findRecentSpittles();

    List<Spittle> findSpittles(long max, int count);

    Spittle findOne(long id);

    void save(Spittle spittle);
}
