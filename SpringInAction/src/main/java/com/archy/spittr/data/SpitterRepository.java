package com.archy.spittr.data;

import com.archy.spittr.Spitter;

/**
  * @ClassName: SpitterRepository
  * @Description:
  * @author i码士技术部-huang
  * @date 2016年12月31日 下午05:01:43
 */
public interface SpitterRepository {

    Spitter save(Spitter spitter);

    Spitter findByUsername(String username);
}
