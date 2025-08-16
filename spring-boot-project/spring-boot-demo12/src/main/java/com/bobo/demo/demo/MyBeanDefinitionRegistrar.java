package com.bobo.demo.demo;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author : lilong
 * @date : 2025-06-09 16:27
 * @description :
 */
public class MyBeanDefinitionRegistrar implements DeferredImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata annotationMetadata) {
		System.out.println("selectImports is run---->MyBeanDefinitionRegistrar");
		return new String[0];
	}

	@Override
	public Predicate<String> getExclusionFilter() {
		return DeferredImportSelector.super.getExclusionFilter();
	}

	/**
	 * 如果这里为空的情况则会执行selectImports 方法
	 * 如果不为空的情况则不会执行selectImports 方法
	 * @return
	 */

	@Override
	public Class<? extends Group> getImportGroup() {
		return MyDeferredImportSelectorGroup.class;
	}

	public static class MyDeferredImportSelectorGroup implements Group{
		private final List<Entry> imports = new ArrayList<>();
		@Override
		public void process(AnnotationMetadata metadata, DeferredImportSelector selector) {
			System.out.println("MyDeferredImportSelectorGroup.Group");
		}

		@Override
		public Iterable<Entry> selectImports() {
			System.out.println("MyDeferredImportSelectorGroup---->selectImports");
			return imports;
		}
	}


}
